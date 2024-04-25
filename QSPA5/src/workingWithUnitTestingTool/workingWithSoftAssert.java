package workingWithUnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class workingWithSoftAssert {
	String actulUrl="https://demowebshop.tri.com/";
	String actulRegUrl="https://demowebshop.tricentis.com/register";
	@Test
	public void demoPage() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Reporter.log("User is able to open empty browser",true);
		driver.manage().window().maximize();
		SoftAssert sf=new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	   // Assert.assertEquals(actulUrl,currentUrl);
		sf.assertEquals(actulUrl, currentUrl);
		
	    Thread.sleep(3000);
	    
	    driver.findElement(By.linkText("Register")).click();
	    String currentUrlReg = driver.getCurrentUrl();
	    Thread.sleep(3000);
	   // Assert.assertEquals(actulRegUrl, currentUrlReg);
	    sf.assertEquals(actulRegUrl, currentUrlReg);
	    sf.assertAll();
	    driver.quit();
	}
}
