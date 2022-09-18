package TestNGlearning.MavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClassB {


	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before classB_classB");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before methodB_classB");
	}
	

	@Test()
	public void testA()
	{
		System.out.println("testA");
	}
	
	
	@Test()
	public void testB()
	{
		System.out.println("testB");
		//to check after test case depends on method execute or not
		//Assert.fail();
	}
	

	@Test()
	public void testC()
	{
		System.out.println("testC");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after methodB_classB");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after classB_classB");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
