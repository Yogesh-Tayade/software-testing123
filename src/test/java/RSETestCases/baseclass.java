package RSETestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import utility.readData;

public class baseclass {
	public static WebDriver driver;
	
	readData read=new readData();
	public String baseurl=read.geturl();
	public String username=read.getusername();
	public String pass=read.getpassword();

	@BeforeClass
	
	public WebDriver setupmethod()
	{
		 driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
	}
}
