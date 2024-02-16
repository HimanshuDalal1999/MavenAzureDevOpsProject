package driverfactorys;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class driverfactory {

	static  WebDriver driver;

	public WebDriver initBrowsers(String browsername) throws MalformedURLException
	{
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else  if (browsername.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		return driver;
		
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
}



