package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demo3 {
	
	@Test(groups= {"Smoke"})
	public void home()
	{
	System.out.println("Personal Loan");
	}
	
	@Parameters ({"URLname"})
	@Test
	public void car(String aurl)
	{
		System.out.println("Car Loan");
		System.out.println(aurl);
	}
	@BeforeSuite
	public void bfsuite()
	{
		System.out.println("Before Suite Test Annotation");
	}
	@Parameters ({"URL"})
	@Test
	public void credit(String urlname)
	{
		System.out.println("Credit Card Loan");
		System.out.println(urlname);
	}
	@BeforeTest
	public void loans()
	{
		System.out.println("Welcome to Loan portal");
	}

}
