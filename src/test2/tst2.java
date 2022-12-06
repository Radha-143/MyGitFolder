package test2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tst2 {
	
	@Test(groups={"Smoke"})
	public void smke()
	{
		System.out.println("Smoke Test for Test2.tst2 class");
	}
	@AfterSuite
	public void suitelevel()
	{
		System.out.println("After Suite folder");
	}
	@Parameters({"GURL"})
	@Test
	public void mtd1(String gname)
	{
		System.out.println("Method one");
		System.out.println(gname);
	}
	
	@Test(dependsOnMethods = {"dm2"})
	public void mtd2()
	{
		System.out.println("Method Exclude");
		
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");		
	}
	
	@Test(enabled=false)
	public void mtd3()
	{
		System.out.println("Disabled************8");
	}
	
	@AfterMethod
	public void aftermehtod()
	{
		System.out.println("After Method");	
	}
	@Test(dependsOnMethods = {"mtd1"})
	public void dm2()
	{
		System.out.println("Method Two");
	}

}
