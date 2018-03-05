package dayanand;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

public class Annotations2 {
	
	@BeforeClass
	public static void init()
	{
		System.out.println("Before Class");
	}

	@Before
	public void initialize()
	{
		System.out.println("Before");
	}
	
	@Test
	public void mytestmethod1()
	{
		System.out.println("Test1");
	}
	
	@Ignore
	@Test
	public void mytestmethod2()
	{
		System.out.println("Test2");
	}
	
	@After
	public void close()
	{
		System.out.println("After");
	}
	
	@AfterClass
	public static void Closeresources()
	{
		System.out.println("After Class");
	}
}
