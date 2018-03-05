package dayanand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class headless {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Phantomjs.binary.path", "D:\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://demo.opencart.com/");
		
		System.out.println("Page title is: " +driver.getTitle());
		driver.close();
		
	}

}
