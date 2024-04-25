package workingWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastnameTextBox() {
		return lastnameTextBox;
	}

	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;

	@FindBy(id = "LastName")
	private WebElement lastnameTextBox;
}
