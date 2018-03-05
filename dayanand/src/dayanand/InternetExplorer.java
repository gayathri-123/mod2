package dayanand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.ie.driver", "D://IEdriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver();
		//String baseurl="file://///D:/WorkingWithForms.html";
		String baseurl="http://www.google.com";
		driver.get(baseurl);
		
	}

}
