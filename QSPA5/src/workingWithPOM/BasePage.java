package workingWithPOM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextBox;
	
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchButton;


	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> radioButtons;
	
	public List<WebElement> getRadioButtons() {
		return radioButtons;
	}


	public WebElement getSearchTextBox() {
		return searchTextBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
