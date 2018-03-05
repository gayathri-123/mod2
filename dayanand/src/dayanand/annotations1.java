package dayanand;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.Test;


public class annotations1 {
	
	
	@Test
	public void b()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void a()
	{
		System.out.println("Test2");
	}
	
	
	@AfterClass
	public static void Closeresources()
	{
		System.out.println("After Class");
	}

}
