package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateTitle extends base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateTitle.class.getName());

	@Test
	public void basePageNavigator() throws IOException {
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES1");
		Assert.assertTrue(lp.getContact().isDisplayed());
		log.info("Validation of title");

	}

	
	@BeforeTest
	public void startup() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));	
		log.info("Navigation to homepage");

	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}


}
