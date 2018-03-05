package dayanand;

import org.testng.annotations.Test;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Screenshot {
	
	@Test public void takescreenshot() throws Exception
	{
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.get("https://www.opencart.com");
		this.takeSnapShot(driver,"D://asnmnt.png");
		
	}
	
	@Test public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception
	{ //convert webdriver object to take screenshot
		TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile,  DestFile);
		
	}


	}

