package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
	
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By commit = By.cssSelector("input[name='commit']");
	
	
	
	
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement signin() {
		return driver.findElement(signin);
	}
	
	public WebElement commit() {
		return driver.findElement(commit);
	}
	


}
