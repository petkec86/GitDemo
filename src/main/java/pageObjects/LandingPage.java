package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector("div h2");
	By contact = By.linkText("CONTACT");
	
	
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public LoginPage getlogin() {
		driver.findElement(signin).click();
		return new LoginPage(driver);
		
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getContact() {
		return driver.findElement(contact);
	}
	
	

}
