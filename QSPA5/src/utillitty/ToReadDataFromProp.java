package utillitty;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromProp {

	@Test
	public void openDemoWebShop() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtilityClass uc = new UtilityClass();
		String url = uc.readDataFromPropFile("./testData/data.properties", "url");
		driver.get(url);
	}
}
