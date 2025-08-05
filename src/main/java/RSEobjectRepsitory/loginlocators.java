package RSEobjectRepsitory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginlocators {
	WebDriver driver;

	public loginlocators(WebDriver driver) 
	{
		this.driver=driver;
	}

	By username=By.id("userEmail");
	public WebElement username()
	{
		return driver.findElement(username);
	}
	
	By password=By.id("userPassword");
	public WebElement password()
	{
		return driver.findElement(password);
	}
	By login=By.id("login");
	public WebElement loginbtn()
	{
		return driver.findElement(login);
	}
}
