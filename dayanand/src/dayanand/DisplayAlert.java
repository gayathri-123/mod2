package dayanand;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		String baseurl=("file:///D:/Users/gkanta/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/AlertExample.html");
		driver.get(baseurl);
		WebElement t=driver.findElement(By.name("btnAlert"));
		t.click();
		Alert s=driver.switchTo().alert();
		String alerttext=s.getText();
		System.out.println("Alert text is:" +alerttext);
		s.accept();
		//s.dismiss();

	}

}
