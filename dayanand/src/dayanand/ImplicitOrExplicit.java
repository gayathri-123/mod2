package dayanand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ImplicitOrExplicit {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		 WebDriverWait mywait=new WebDriverWait(driver,10);
		//driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
		
		String baseurl=("file:///D:/Users/gkanta/Desktop/Old%20Firefox/Selenium/Selenium%20Installations/Selenium%20Demos%20&%20Lab%20files/Lesson%205-HTML%20Pages/Lesson%205-HTML%20Pages/WorkingWithForms.html");
				
				
				driver.get(baseurl);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUserName")));
		
		WebElement t=driver.findElement(By.id("txtUserName"));
		t.sendKeys("Selenium User");
	}

}



