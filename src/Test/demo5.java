package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo5 {

	
	@AfterTest
	public void af()
	{
		System.out.println("After Test annotation execution");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("After Suite Test Annotation");
	}
	@Test(groups= {"Smoke"})
	public void radha()
	{
		System.out.println("RadhaRani");
	}
	@Test(enabled=false)
	public void krishna()
	{
		System.out.println("Sri Krishna");
	}
	@BeforeTest
	public void radhaKrishna()
	{
		System.out.println("Before annotation Jai Shree RadhaKrishna");
	}

}
