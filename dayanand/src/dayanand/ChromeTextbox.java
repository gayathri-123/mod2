package dayanand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTextbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/VnV Auto & Man Testing/New folder (10)/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//String baseurl="file://///D:/WorkingWithForms.html";
		String baseurl="http://www.google.com";
		driver.get(baseurl);
		
	}

}
