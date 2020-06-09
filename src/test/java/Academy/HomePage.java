package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	public WebDriver driver;

	private static Logger log = LogManager.getLogger(HomePage.class.getName());

	@Test(dataProvider = "getData")
	public void basePageNavigator(String username, String password) throws IOException {

		LandingPage l = new LandingPage(driver);	
		LoginPage lp = l.getlogin();
		lp.getEmail().sendKeys(username);
		log.info("Email is entered");
		lp.getPassword().sendKeys(password);
		log.info("password is entered is entered");
		lp.commit().click();
		ForgotPassword fp=lp.forgotPassword();
		fp.signin().sendKeys("xxx@www.ww");
		fp.commit().click();

	}

	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		data[0][0] = "petkec85@gmail.com";
		data[0][1] = "Kozila50";
		return data;

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
