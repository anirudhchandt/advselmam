package utillitty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	WebDriver driver;

	/**
	 * If you want to call getTitle for the varification
	 * 
	 * @return
	 */

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	/**
	 * 
	 * @return
	 */
	public String getcurrentUrl() {
		String CurrentUrl = driver.getCurrentUrl();
		return CurrentUrl;
	}

	public void SelectByIndex(WebElement selectElement, int index) {
		Select sel = new Select(selectElement);
		sel.selectByIndex(index);

	}

	public void SelectByValue(WebElement selectElement, String value) {
		Select sel = new Select(selectElement);
		sel.selectByValue(value);

	}
	
	//validation method
	//select
	//actions
	//robot

}
