package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingWithInclude1 {

	@Test
	public void executeScript() {
		Reporter.log("R15",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
		driver.quit();
	}
}
