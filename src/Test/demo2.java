package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {
	
	@Test(groups= {"Smoke"})
	public void dm2()
	{
		System.out.println("Welcome");
	}
	@Test
	public void dm3()
	{
		System.out.println("Farewell");
	}
	@BeforeTest
	public void bf()
	{
		System.out.println("Before test execution for Demo modules");
	}
}
