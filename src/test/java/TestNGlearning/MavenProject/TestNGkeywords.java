package TestNGlearning.MavenProject;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGkeywords {

	
		@BeforeClass
		public void beforeclass()
		{
			System.out.println("before class");
		}
		
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("before method");
		}
		

		@Test(dependsOnMethods =("testB"),priority=1)
		public void testA()
		{
			System.out.println("testA");
		}
		
		
		@Test(priority=2)
		public void testB()
		{
			System.out.println("testB");
			//to check after test case depends on method execute or not
			//Assert.fail();
		}
		

		@Test(invocationCount=2, priority=-1,timeOut=3000)
		public void testC()
		{
			System.out.println("testC");
		}
		
		@Test(dependsOnMethods =("testB"),enabled=false,priority=0)
		public void testD()
		{
			System.out.println("testD");
		}
		
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("after method");
		}
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("after class");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


