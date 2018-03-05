package dayanand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class AlertTextbox {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String sText;
	WebDriver driver=new FirefoxDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("history.go(0)");
	
	driver.get("file:///D:/Users/gkanta/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/AlertExample.html");
	sText = js.executeScript("return document.title;").toString();
	System.out.println(sText);
	
	driver.findElement (By.name("txtName")).sendKeys("Gayathri");
	WebElement button=driver.findElement(By.name("btnAlert"));
	//perform click on show alert box button using javascript executor
	//js.executeScript("argument[0].click();",button);
	
	
	js.executeScript("alert('hello world');");

}
}