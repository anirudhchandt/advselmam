package workingWithUnitTestingTool;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (workingWithListerners.class)
public class loginScript {
public static WebDriver driver;
	@Test
	public void login() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String currentUrl = driver.getCurrentUrl();

		assertEquals("https://demowe.tricentis.com/", currentUrl);
		driver.quit();
	}
}
