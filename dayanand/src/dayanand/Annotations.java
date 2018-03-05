package dayanand;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class Annotations {
	
	@Before
	public void initialize()
	{
		System.out.println("Before");
	}

	
	@Test
	public void mytestmethod()
	{
		System.out.println("Test");
	}
	
	@After
	public void close()
	{
		System.out.println("After");
	}
}
