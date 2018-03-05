package dayanand;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class remote {
	
	WebDriver driver;
	String baseurl,nodeurl;
	
	@BeforeTest
	public void display() throws MalformedURLException
	{
		//baseurl="http://demo.opencart.com/";
		//baseurl="http://www.opencart.com/";
				baseurl="file:///D:/Users/gkanta/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/WorkingWithForms.html";
				nodeurl= "http://10.102.52.90:5666/wd/hub";
				DesiredCapabilities t= new DesiredCapabilities().chrome();
				t.setBrowserName("chrome");
				t.setPlatform(Platform.WINDOWS);
				driver=new RemoteWebDriver(new URL(nodeurl),t);
				
			}
			@AfterTest
			public void aftertest()
			{
				//driver.close();
				
			}
			@Test
			public void simpletest()
			{
				driver.get(baseurl);
				//thread.sleep(1000);
				//Assert.assertEquals("Your Store",driver.getTitle());
				Assert.assertEquals("Email Registration Forms",driver.getTitle());
			}

		

	}
 

