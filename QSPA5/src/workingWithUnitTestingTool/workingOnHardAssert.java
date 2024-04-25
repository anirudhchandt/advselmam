package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingOnHardAssert {
	
	String actulUrl="https://demowebshop.tricentis.com/";
	String actulRegUrl="https://demowebshop.tricentis.com/register";
	@Test
	public void demoPage() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("User is able to open empty browser",true);
		driver.manage().window().minimize();
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	    Assert.assertEquals(actulUrl,currentUrl);
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Register")).click();
	    String currentUrlReg = driver.getCurrentUrl();
	    Assert.assertEquals(actulRegUrl, currentUrlReg);
	    driver.quit();
	}

}
