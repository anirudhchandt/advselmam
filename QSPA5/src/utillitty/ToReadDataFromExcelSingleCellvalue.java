package utillitty;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToReadDataFromExcelSingleCellvalue {

	@Test
	public void run() throws EncryptedDocumentException, IOException {
		UtilityClass uc=new UtilityClass();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url = uc.readingDataFromExcelSingleValue("./testData/testdata.xlsx","login",1,0);
		String un = uc.readingDataFromExcelSingleValue("./testData/testdata.xlsx","login",1,1);
		
		driver.get(url);
		
	}
}
