package TestNGlearning.MavenProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {

	
	
	
	
	@BeforeSuite
	public void BasicSetup()
	{
		System.out.println("maximize window");
		System.out.println("disable notification");
		System.out.println("add implicit wait");
	}
	@BeforeTest
	public void LaunchBrowser()
	{
		System.out.println("WebDriver instance");
	}
	
	@BeforeClass
	public void LaunchApp()
	{
		System.out.println("open URL");
	}
	@BeforeMethod
	public void BeforeEachtestCase()
	{
		System.out.println("login");
	}
	@Test
	public void TestCase1()
	{
		System.out.println("test1");
	}
	@Test
	public void TestCase2()
	{
		System.out.println("test2");
	}
	@Test
	public void TestCase3()
	{
		System.out.println("test3");
	}
	@Test
	public void TestCase4()
	{
		System.out.println("test4");
	}
	@AfterMethod
	public void AfterEachTestMethod()
	{
		System.out.println("Logout");
	}
	@AfterClass
	public void GenerateReoprt()
	{
		System.out.println("Report");
	}
	@AfterTest 
	public void closedriver()
	{
		System.out.println("CloseDriver");
	}
	@AfterSuite
	public void cleanupCode()
	{
		System.out.println("perform cleanup activity");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
