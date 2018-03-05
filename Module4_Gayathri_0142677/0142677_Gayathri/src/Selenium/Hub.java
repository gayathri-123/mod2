package Selenium;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import bsh.Remote;
public class Hub {

	
		private WebDriver driver;
		private String baseUrl;

	
		@BeforeTest

		public void beforeannotation() throws MalformedURLException
		{
		
			 driver = new FirefoxDriver();
			 String baseUrl = "https://demo.opencart.com/";
			  driver.get(baseUrl);
			  String nodeurl= "http://10.102.52.90:5666/wd/hub";
				DesiredCapabilities t= new DesiredCapabilities().chrome();
				t.setBrowserName("chrome");
				t.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(new URL(nodeurl),t);
			
		}
			@Test

				public void testannotation()throws Exception
				{
				
		
			if(driver.getTitle().contentEquals("Your Store"))
			 {
			System.out.println(" Verify	Title Your Store");
			}
			else
			{
			System.out.println("Title Your Store Not Verified");
			}
							    
			Thread.sleep(1000);
							   
			//List<WebElement>count=driver.findElements(By.tagName("a"));
			driver.findElement(By.xpath(".//*[@id='top-links']/ul/li[2]/a/span[2]")).click();
			driver.findElement(By.linkText("Register")).click();
							    
			driver.findElement(By.id("input-email")).sendKeys("Gayathriab@gmail.com");
			driver.findElement(By.id("input-telephone")).clear();
			driver.findElement(By.id("input-telephone")).sendKeys("2576378521");

			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
							     
			 if(driver.findElement(By.cssSelector("div.text-danger")).getText().contentEquals("First Name must be between 1 and 32 characters!"))
			 {
			System.out.println("Verify First Name is a Mandatory");
			} 
			 else
			 {
			System.out.println("First Name Not verified");
		    }
							    
			 if(driver.findElement(By.xpath("//fieldset[@id='account']/div[3]/div/div")).getText().contentEquals("Last Name must be between 1 and 32 characters!"))
			 {
			System.out.println("Verify Last Name is a Mandatory");
			}
			else
			{
			System.out.println("Last Name Not verified");
			}
							    
							    driver.findElement(By.id("input-password")).clear();
							    driver.findElement(By.id("input-password")).sendKeys("123654");
							    driver.findElement(By.id("input-confirm")).clear();
							    driver.findElement(By.id("input-confirm")).sendKeys("123");
							    Thread.sleep(2000);
							    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
							    
							    if(driver.findElement(By.xpath("//div[@id='content']/form/fieldset[2]/div[2]/div/div")).getText().contentEquals("Password confirmation does not match password!"))
							    {
							    	System.out.println("Passwords Do Not Match  Verified");
							    }
							    else
							    {
							    	System.out.println("Passwords Do Not Match  Not Verified");
							    }
							    
							    driver.findElement(By.id("input-firstname")).clear();
							    driver.findElement(By.id("input-firstname")).sendKeys("Gayathri");
							    driver.findElement(By.id("input-lastname")).clear();
							    driver.findElement(By.id("input-lastname")).sendKeys("Kanta");
							    driver.findElement(By.id("input-confirm")).clear();
							    driver.findElement(By.id("input-confirm")).sendKeys("123");
							    
							    driver.findElement(By.name("newsletter")).click();
							    driver.findElement(By.xpath("(//input[@name='newsletter'])[2]")).click();
							    driver.findElement(By.name("agree")).click();
							    
							    Thread.sleep(1000);
							    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
							    
							    Thread.sleep(3000);
							    
							    if(driver.findElement(By.cssSelector("#content > h1")).getText().contentEquals("Your Account Has Been Created!"))
							    {
							    	System.out.println("Email Pattern Verified");
							    	System.out.println(" Verify Heading Your account has been created");
							    }
							    else
							    {
							    	System.out.println("Heading Your account has been created Not Verified");
							    }
							    
							    driver.findElement(By.linkText("Phones & PDAs")).click();
							    Thread.sleep(1000);
							    driver.findElement(By.cssSelector("div.image > a > img.img-responsive")).click();

							    if(driver.findElement(By.cssSelector("div.col-sm-4 > h1")).getText().contentEquals("HTC Touch HD"))
							    {
							    	System.out.println("Text Verified 	HTC Touch HD");
							    }
							    else
							    {
							    	System.out.println("Text Not Verified");
							    }
							    Thread.sleep(2000);
							    driver.navigate().back();
							    Thread.sleep(1000);
							    driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
							    
							    Thread.sleep(3000);
							    if(driver.findElement(By.xpath("//div[@id='product-category']/div")).getText().contentEquals("Success: You have added HTC Touch HD to your shopping cart!"))
							    {
							    	System.out.println("Product Added Succesfully Text Verified");
							    }
							    else
							    {
							    	System.out.println("Product Added Succesfully Text Not Verified");
							    }
							    	    
							    driver.findElement(By.linkText("Brands")).click();
							    if(driver.getTitle().contentEquals("Find Your Favorite Brand"))
							    {
							    	System.out.println(" Verify	Title Find Your Favorite Brand");
							    }
							    else
							    {
							    	System.out.println("Title Not Verified");
							    }
							    
							    
							    driver.findElement(By.linkText("Canon")).click();
							    if(driver.findElement(By.cssSelector("h2")).getText().contentEquals("Canon"))
							    {
							    	System.out.println("Heading Verified 	Cannon");
							    }
							    else
							    {
							    	System.out.println("Heading Not Verified");
							    }
				  
							    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
							    Thread.sleep(3000);
							    if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().contentEquals("Success: You have added Canon EOS 5D to your wish list!\n×"))
							    {
							    	System.out.println("Verify Product Added Succesfully to WishList Text");
							    }
							    else if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().contentEquals("You must login or create an account to save Canon EOS 5D to your wish list!\n×"))
							    {
							    	System.out.println("Verify Product Added Succesfully to WishList Text");
							    }
							    else
							    {
							    	System.out.println("Product Added Succesfully to WishList Text Not Verified");
							    }
							    
							    driver.findElement(By.linkText("Wish List")).click(); 
							    WebDriverWait wait = new WebDriverWait(driver, 10);
							    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Continue")));
							    driver.findElement(By.linkText("Continue")).click();
							    driver.close();
							    System.out.println("Browser Closed.");
						}

					}





	


