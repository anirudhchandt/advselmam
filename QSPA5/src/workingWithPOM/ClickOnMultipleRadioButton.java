package workingWithPOM;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickOnMultipleRadioButton extends BaseClass {

	@Test
	public void toClickOnMultipleRadioElement() throws InterruptedException {
		BasePage bp = new BasePage(driver);
		for (WebElement button : bp.getRadioButtons()) {
			button.click();
			Thread.sleep(3000);
		}
	}
}
