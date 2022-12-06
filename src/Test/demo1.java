package Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

public class demo1 {
	
	
	@Test(groups= {"Smoke"})
	public void d1()
	{
		System.out.println("Hello");
	}
	@Parameters ({"URL"})
	@Test
	public void d2(String urlname)
	{
		System.out.println("Bye");
		System.out.println(urlname);
	}
	@AfterTest
	public void af()
	{
		System.out.println("After test execution for Demo modules");
	}
}
