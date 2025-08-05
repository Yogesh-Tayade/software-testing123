package RSETestCases;

import org.testng.annotations.Test;

import RSEobjectRepsitory.addtocartlocators;
import RSEobjectRepsitory.loginlocators;

public class logintestcases extends baseclass{

	@Test
	public void logindone()
	{
		driver.get(baseurl);
		loginlocators obj=new loginlocators(driver);
			obj.username().sendKeys(username);
			obj.password().sendKeys(pass);
			obj.loginbtn().click();
		
			addtocartlocators add=new addtocartlocators(driver);
			add.addIntocart().click();;
	}
}
