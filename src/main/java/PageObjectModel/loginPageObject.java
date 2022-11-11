package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	WebDriver driver;
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By LoginButton = By.xpath("//input[@id='Login']");
	
	public loginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		driver=driver2;
	}

	public  WebElement EnterUsername() {
		return driver.findElement(username);
	}
	
	public  WebElement EnterPassword() {
		return driver.findElement(password);
	}
	
	public  WebElement ClickLoginButton() {
		return driver.findElement(LoginButton);
	}

}
