package workingWithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P2 extends BaseClass {

	@Test
	public void searchBooks() throws InterruptedException {
		WebElement searchTextBox = driver.findElement(By.id("small-searchterms"));
		searchTextBox.sendKeys("Books");
		Thread.sleep(3000);
	    driver.navigate().refresh();
		Thread.sleep(3000);
		searchTextBox.sendKeys("computers");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
	}
}
