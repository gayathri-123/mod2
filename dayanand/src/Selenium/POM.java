package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Loginpm;


public class POM {
	
	WebDriver driver;
	Loginpm objlogin;
	
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///D:/Users/gkanta/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lab%20Files/Lab%20Files/LoginPage.html");
	}
	
	@Test
	public void DoLogin()
	{
		objlogin = new Loginpm();
		objlogin.login(driver);
		objlogin.LogintoShopping("strUserName", "strPassword");
	}

}
 