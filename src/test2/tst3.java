package test2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tst3 {
	
	@Test(groups={"Smoke"})
	public void smke()
	{
		System.out.println("Smoke Test for Test2.tst3 class");
	}
	@Test
	public void classlevel()
	{
		System.out.println("Class one");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");		
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}
	@Parameters({"AURL"})
	@Test
	public void classlevel1(String aname)
	{
		System.out.println("Class Two");
		System.out.println(aname);
		
	
	}
	@Test(enabled=false)
	public void cls()
	{
		System.out.println("xxxxxxxx");
	}
	@BeforeSuite
	public void suitelevel()
	{
		System.out.println("Before Suite folder");
	}

}
