package utillitty;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromRow {

	@Test
	public void run() throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		UtilityClass uc=new UtilityClass();
		String[] loginData = uc.readDataFromExcelOneRow("./testData/testdata.xlsx", "loginData", 0);
		driver.get(uc.readDataFromPropFile("./testData/data.properties", "url"));
	
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(loginData[1]);
		driver.findElement(By.id("Password")).sendKeys(loginData[2]);
	}
}
