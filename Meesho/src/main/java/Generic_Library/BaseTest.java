package Generic_Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public static WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void BrowserSetup() {
		// System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod(alwaysRun = true)
	public void BrowserTeardown(ITestResult res) throws InterruptedException {
		Reporter.log("close", true);
		Thread.sleep(2000);
		driver.quit();
	}
}
