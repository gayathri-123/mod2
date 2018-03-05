package dayanand;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGAnnotations {
	
	@Test
	public void testCase1()
	{
		System.out.println("In testCase1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("In testCase2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("In beforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In afterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("In beforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("In afterClass");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("In Before Test");
	}

	@AfterTest
	public void AfterTest()
	{
		System.out.println("In After Test");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("In Before Suite");
	}
}
