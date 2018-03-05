package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.opencart.com/");
		
		Boolean b =  driver.getTitle().contains("Your Store");
		if(b==true)
		{
			System.out.println("The title of homepage is right");
		}
		else
		{
			System.out.println("The title of homepage ");
		}
		
		driver.findElement(By.xpath(".//*[@id='cart']/button")).click();
		String s1 = driver.findElement(By.cssSelector(".text-center")).getText();
		if(s1.equals("Your shopping cart is empty!"))
			System.out.println("Dropdown Message is correct");
		else
			System.out.println("Dropdown message is incorrect");
		
		driver.findElement(By.xpath("html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
		if(driver.findElement(By.linkText("Contact Us")).getText().equals("Contact Us"))
				System.out.println("Contact heading is proper");
		else
			System.out.println("Contact heading is not proper");
		
		if(driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/address")).getText().equals("Address 1"))
			System.out.println("Default address is right");
		else
			System.out.println("Default address is wrong");
		
		driver.findElement(By.id("input-name")).sendKeys("Bijal");
		
		driver.findElement(By.id("input-email")).sendKeys("abc@gmail");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		if(driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[2]/div/div")).getText().equals("E-Mail Address does not appear to be valid!"))
			System.out.println("Email address entered is invalid");
		else
			System.out.println("Email address entered is valid");
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("input-enquiry")).sendKeys("When will Iphone 7 be available on your website?");
		WebDriverWait mywait=new WebDriverWait(driver,30);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-enquiry")));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		System.out.println("Your enquiry is submitted successfully.");
		driver.findElement(By.xpath(".//*[@id='content']/div/div/a")).click();
		driver.findElement(By.xpath("html/body/footer/div/div/div[3]/ul/li[1]/a")).click();
		String s2 = driver.findElement(By.xpath(".//*[@id='content']/h1")).getText();
		if(s2.equals("Find Your Favorite Brand"))
			System.out.println("The favourite brand title is correct");
		else
			System.out.println("The favourite brand title is incorrect");
		
		driver.findElement(By.xpath(".//*[@id='content']/div[5]/div/a")).click();
		if(driver.findElement(By.cssSelector("p.price")).getText().equals("$1,202.00\nEx Tax: $1,000.00"))
			System.out.println("The price is validated");
		else
			System.out.println("The price is not validated");
		System.out.println(driver.findElement(By.cssSelector("p.price")).getText());
	
		driver.findElement(By.cssSelector("div.button-group > button[type=\"button\"]")).click();

		try {
				Thread.sleep(3000);
					if(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText().equals("Success: You have added Sony VAIO to your shopping cart!\n×"))
						System.out.println("Product Added Validation Verified");
					else
						System.out.println("Product Added Validation Failed");
					
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println(driver.findElement(By.xpath("//div[@id='product-manufacturer']/div")).getText());
}
}