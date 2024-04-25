package workingWithPOM;

import org.testng.annotations.Test;

public class Tc_Demo_001 extends BaseClass{

	@Test
	public void validateThatUserIsAbleToRegister() {
	RegisterPage rp=new RegisterPage(driver);
	
	rp.getRegisterLink().click();
	rp.getFemaleRadioButton().click();
	rp.getFirstNameTextBox().sendKeys("Apoorva");
	rp.getLastnameTextBox().sendKeys("Mangalore");
	}
}
