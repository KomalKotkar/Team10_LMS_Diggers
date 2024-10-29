package hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class ApplicationHooks {
	
	public static WebDriver driver;
	Properties prop;

	@Before
	public void setup() {
		prop = ConfigReader.initializeProperties();
		DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

	@After
	public void tearDown(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String scenarioName = scenario.getName().replaceAll(" ","_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenShot = ts.getScreenshotAs(OutputType.FILE);
			String destinationPath = System.getProperty("user.dir")+"\\screenshots\\"+scenarioName+".png";
			FileUtils.copyFile(screenShot, new File(destinationPath));
		}
	//driver.quit();
	}
}
