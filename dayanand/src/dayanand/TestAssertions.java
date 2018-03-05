package dayanand;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;



public class TestAssertions {
	
	/**
	 * param args
	 */
	@Test
public void testassertation()
	{
	
	String str1=new String("abc");
	String str2=new String("abc");
	String str3=null;
	String str4="abc";
	String str5="abc";
	int Val1=6;
	int Val2=5;
	String[] expectedarry={"one","two","three"};
	String[] resultarry={"one","two","three"};
	
	//check two objects are equal
	assertEquals(str1,str2);
	
	//check the condition is true
	assertTrue(Val1>Val2);
	
	//assertTrue(Val1<Val2);
	
	//check the condition is false
	assertFalse(Val1>Val2);
	
	//check the condition is not null
	assertNotNull(str1);
	
	//check that the object is null
	assertNull(str3);
	
	//check if two object reference point to same object
	assertSame(str4,str5);
	
	//check if two object reference not point to same object
	assertNotSame(str1,str3);
	
	//check whether two arrays are equal to each other
	assertArrayEquals(expectedarry,resultarry);
	
	
	}
}
