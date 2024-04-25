package utillitty;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToReadMultipleData {

	@Test(dataProvider = "login")
	public void run(String un, String pwd) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		UtilityClass uc = new UtilityClass();
		String url = uc.readDataFromPropFile("./testData/data.properties", "url");
		driver.get(url);

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.quit();
	}
	@DataProvider(name = "login")
	public String[][] dataSupply() throws EncryptedDocumentException, IOException {
		return UtilityClass.readingMultipleData("./testData/testdata.xlsx", "loginData1");

	}

}