package simpleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_Login_001 {

	public static void main(String[] args) {
		String actualURL = "https://demowebshop.tricentis.com/";
		String actualTitlePage = "Demo Web Shop";
		String actualLoginPageUrl = "https://demowebshop.tricentis.com/login";
		String emailID = "apoorva.c@testyantra.com";
		boolean actualcheckBox = true;

		// step 1:Open the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("User is able to open empty browser");
		driver.manage().window().maximize();
		System.out.println("User is able to maximize the browser");

		// step 2:Enter the URL
		driver.get("https://demowebshop.tricentis.com/");
		String titleOFthePage = driver.getTitle();
		String currentURL = driver.getCurrentUrl();
		if (actualURL.equals(currentURL)) {
			System.out.println("User is able to open demo webshop");
		} else {
			System.out.println("User is not able to open demo webshop");
		}
		if (actualTitlePage.equals(titleOFthePage)) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is not correct");
		}

		// step 3:Click on login link
		driver.findElement(By.linkText("Log in")).click();
		String loginPageURl = driver.getCurrentUrl();
		if (actualLoginPageUrl.equals(loginPageURl)) {
			System.out.println("User is able to land on login page");
		} else {
			System.out.println("User is not able to click login page");
		}

		// step 4:Enter valid email ID
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys(emailID);
		String value = emailTextBox.getAttribute("value");
		System.out.println(value);
		if (emailID.equals(value)) {
			System.out.println("User is able to send email ID");
		} else {
			System.out.println("User is not able to send valid data");
		}

		// step 5:Enter valid password

		// step 6:Click on check box
		WebElement checkBox = driver.findElement(By.id("RememberMe"));
		checkBox.click();
		boolean flag = checkBox.isSelected();
		System.out.println(flag);
		if (checkBox.isSelected()) {
			System.out.println("User is able to click on checkbox");
		} else {
			System.out.println("User is not bale to click on checkBox");
		}

		// step 7:Click on login button

		// step 8:
		driver.quit();
		System.out.println("User is able to quit the browser");

	}

}
