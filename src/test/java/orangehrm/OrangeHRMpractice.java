package orangehrm;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompackage.AddEmployee;
import pompackage.Homepage;
import pompackage.LogOut;
import pompackage.Login;
import utility.Pojo;
import utility.Screenshot;

public class OrangeHRMpractice extends Pojo {

	
	WebDriver driver;
	boolean leavedisplay;
	boolean recruitmentdisplay;
	boolean pimdisplay;
	boolean fnamedisplay;
	boolean mnamedisplay;
	boolean lnamedisplay;
	boolean eiddisplay;
	ExtentTest logger;
	ExtentReports extent;
	
	@BeforeTest
	public void report()
	{
		//only create one file 
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/OrangeHRMreport.html");
	
		//generate report format
		 extent=new ExtentReports();
		
		//attach report to file
		extent.attachReporter(reporter);
		
		//create report
		 logger=extent.createTest("login");
		 logger=extent.createTest("homepage");
		 logger=extent.createTest("addemployee");
	
	
		
		
	
	}
	@BeforeClass
	public void setup()

	{
		WebDriver driver= openChromeBrowser();
		this.driver=driver;
		
	}
	
	@Test(priority=0)
	public void login()
	{
		Login login=new Login(driver);
		login.sendusername();
		login.sendpassword();
		login.clickOnLoginButton();
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		Assert.assertEquals(actualurl, expectedurl);
	}
	
	@Test(priority=1)
	public void homepage() throws IOException
	{
		Homepage home=new Homepage(driver);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(leavedisplay);
		soft.assertTrue(recruitmentdisplay);
		soft.assertTrue(pimdisplay);
		
		home.sendEmployeeName();
		home.sendEmployeeID();
		home.sendsupervisorName();
		home.ClickOnAdd();
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee";
		Assert.assertEquals(actualurl, expectedurl);
		
		
		Screenshot.captureScreenshot(driver);
		
		
		
		soft.assertAll();
		
		
		
	}
	
	@Test(dependsOnMethods=("homepage"),priority=2)
	public void addemployee()
	{
		AddEmployee employee=new AddEmployee(driver);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(fnamedisplay);
		soft.assertTrue(mnamedisplay);
		soft.assertTrue(lnamedisplay);
		soft.assertTrue(eiddisplay);

		employee.sendfirstname();
		employee.sendmiddlename();
		employee.sendlastname();
		employee.sendeidname();
		employee.clickOnSaveButton();
		
		String actualurl=driver.getCurrentUrl();
		System.out.println(actualurl);
		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee";
		Assert.assertEquals(actualurl, expectedurl);	
		
		System.out.println("done");
		
		
		
	
	}
	
	@Test(priority=2)
	public void logout()
	{
		LogOut logout=new LogOut(driver);
		logout.clickonpaulcolling();
		logout.clickOnlogout();
		
	}
	
	@AfterMethod
	public void Screenshot(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String Temp=Screenshot.captureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(Temp).build());
		}
		
		extent.flush();
	}
	
	
	
	@AfterClass
	public void driverclose()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
