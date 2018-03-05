package dayanand;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class PriorityTesting {
	
	@Test(priority=2)
	public void AllSend()
	{
		System.out.println("After Login first mail can be send");
	}
	
	@Test(priority=1)
	public void Login()
	{
		System.out.println("After registration user can login");
	}
	
	@Test(priority=0)
	public void Registration()
	{
		System.out.println("User have to register");
	}
	

}
