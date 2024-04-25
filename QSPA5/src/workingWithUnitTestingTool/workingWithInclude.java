package workingWithUnitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class workingWithInclude {

	@Test
	public void executeScript1() {
		Reporter.log("42 Bobber",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
		driver.quit();
	}
	@Test
	public void executeScript2() {
		Reporter.log("Perak",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/motorcycles/perak");
		driver.quit();
	}
}

