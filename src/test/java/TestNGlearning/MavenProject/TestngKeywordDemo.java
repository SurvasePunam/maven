package TestNGlearning.MavenProject;

import org.testng.annotations.Test;

public class TestngKeywordDemo {

	@Test(priority=4)
	public void TestCase1()
	{
		System.out.println("test1");
	}
	@Test(priority=2)
	public void TestCase2()
	{
		System.out.println("test2");
	}
	@Test(priority=0,enabled=false)
	public void TestCase3()
	{
		System.out.println("test3");
	}
	@Test(priority=-2)
	public void TestCase4()
	{
		System.out.println("test4");
	}
	@Test(invocationCount=4)
	public void TestCase5()
	{
		System.out.println("test5");
	}
}
