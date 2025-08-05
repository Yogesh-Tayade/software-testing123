package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class readData {
	Properties prop;
	private Reader fr;
	public readData()
	{
		FileReader fr=null;
		
		try {
			 fr=new FileReader("D:/Automation/AutomationFramework/configuration/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop=new Properties();
		try {
			prop.load(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String geturl()
	{
		String baseurl=prop.getProperty("url");
		return baseurl;
	}
	
	public String getusername()
	{
		String username=prop.getProperty("username");
		return username;
		
	}
	public String getpassword()
	{
		String pass=prop.getProperty("password");
		return pass;
	}
}












