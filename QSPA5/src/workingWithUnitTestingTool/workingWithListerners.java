package workingWithUnitTestingTool;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class workingWithListerners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " Test case is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " Test case is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		LocalDateTime systemTime = LocalDateTime.now();
		System.out.println(systemTime);
		String srnShtTime = systemTime.toString().replace(":", "-");

		TakesScreenshot ts = (TakesScreenshot) loginScript.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./errorShots/" + srnShtTime + ".png");

		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(result.getName() + " Test case is fail");
	}

}
