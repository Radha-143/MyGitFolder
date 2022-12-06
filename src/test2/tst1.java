package test2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tst1 {
	
	
	@Test
	public void tstt()
	{
		System.out.println("Test one");
		
	}
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test Annotation");		
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After Test Annotation");	
	}
	@Test
	public void tstd()
	{
		System.out.println("Test Two");
	}
	@Test(groups={"Smoke"})
	public void smke()
	{
		System.out.println("Smoke Test for Test2.tst1 class");
	}


}
