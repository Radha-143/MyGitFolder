package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo6 {
	
	
	@Test
	public void welcome()
	{
		System.out.println("Welcome to Capgemini Webpage");
	}
	@Test(groups= {"Smoke"})
	public void krishnaRukmini()
	{
		System.out.println("Shree Krishna Rukmini");
	}
	@AfterMethod
	public void Afmethod()
	{
		System.out.println("Hare Krishna Hare Krishna Hare Krishna Hare Krishna");
	}
	@Test(groups= {"Smoke"})
	public void krishnaSathyabhama()
	{
		System.out.println("Shree Krishna SathyaBhama");
	}
	
	@Test(dependsOnMethods = {"welcome"})
	public void SrinivaPadhmavathi()
	{
		System.out.println("Shree Sriniva Padhmavathi");
	}
	@BeforeMethod
	public void Bfmethod()
	{
		System.out.println("Radheshyam Radheshyam Radheshyam Radheshyam Radheshyam Radheshyam");
	}
}
