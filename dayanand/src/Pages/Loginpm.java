package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpm {
	
	
		WebDriver driver;
		By username = By.name("userid");
		By password = By.name("pswrd");
		By Loginbtn = By.xpath("html/body/form/input[3]");
		By Cancelbtn = By.xpath("html/body/form/input[4]");
		
		
		public void login(WebDriver driver)
		{
			this.driver=driver;
			
		}
		
		//set username in textbox
		public void setUserName(String strUserName)
		{
			driver.findElement(username).sendKeys("SeleniumUser");
			
		}
		//set password in textbox
		public void setPassword(String strPassword)
		{
			driver.findElement(password).sendKeys("selenium123");
			
		}
		//click on login button
		public void clickLogin()
		{
			driver.findElement(Loginbtn).click();
		}
		
		public void LogintoShopping(String strUserName,String strPassword)
		{
			//Fill username and password
			this.setUserName(strUserName);
			this.setPassword(strPassword);
			//click on Login button
			this.clickLogin();
		}
		

	

}
