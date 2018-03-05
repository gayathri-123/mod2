package dayanand;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestNG {

	@Test
	public void testCheck()
	{
		String str="Welcome to Online Quiz";
		assertEquals("Welcome to Online Quiz", str);
	}
}
