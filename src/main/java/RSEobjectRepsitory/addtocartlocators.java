package RSEobjectRepsitory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addtocartlocators {
	public static WebDriver driver;
	public addtocartlocators(WebDriver driver)
	{
		this.driver=driver;
	}
	By addIntocart=By.xpath("(//*[@class='btn w-10 rounded'])[1]");
	public WebElement  addIntocart()
	{
		return driver.findElement(addIntocart);
		
	}
}
