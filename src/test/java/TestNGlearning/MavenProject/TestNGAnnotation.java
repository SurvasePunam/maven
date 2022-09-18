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

public class TestNGAnnotation {
	
	@BeforeSuite
	public void BeforeSuiteMethod(){
		System.out.println("BeforeSuiteMethod");
	}
	@BeforeTest
	public void BeforeTestMethod(){
		System.out.println("BeforeTestMethod");
	}
	@BeforeClass
    public void BeforeClassMethod(){
    	System.out.println("BeforeClassMethod");
    }
	@BeforeMethod
	public void BeforeMethodMethod(){
		System.out.println("BeforeMethodMethod");
	}
	@Test
	public void TestCase1() {
		
	}
	@Test
	public void TestCase2() {
		
	}
	@AfterSuite
public void AfterSuiteMethod(){
	System.out.println("AfterSuiteMethod");
	}
	@AfterTest
	public void AfterTestMethod(){
		System.out.println("AfterTestMethod");
	}
	@AfterClass
    public void AfterClassMethod(){
    	System.out.println("AfterClassMethod");
    }
	@AfterMethod
	public void AfterMethodMethod(){
		System.out.println("AftermethodMethod");
	}
}
