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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompackage.LogOut;
import pompackage.Login;
import utility.Pojo;
import utility.Screenshot;



public class LoginTest extends Pojo {
	
	WebDriver driver;
	boolean result;
	ExtentReports extent;
	ExtentTest logger;
	
	
	@BeforeClass
	public void setup()
	{
		WebDriver driver=openChromeBrowser();
		this.driver=driver;
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/logintestScreenshot.html");
	    extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    logger=extent.createTest("login");
	    
	
	
	
	}
	
	
	
	@Test
	public void login()
	{
		Login login=new Login(driver);
		login.sendusername();
		login.sendpassword();
		login.clickOnLoginButton();
		
		//Assertion=to verify operation
		//1) Hard Assert=static methods
		//After failure it will give result pass or fail
		
		//to check whether after login correct page will open
//		String actualurl=driver.getCurrentUrl();
//		System.out.println(actualurl);
//		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		Assert.assertEquals(actualurl, expectedurl);      //true=pass, false=fail
		
		//notEquals=to check whether actualurl and expectedurl are not equal
//		String actualurl=driver.getCurrentUrl();
//		System.out.println(actualurl);
//		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		Assert.assertNotEquals(actualurl,expectedurl);     //equal=fail, different=pass
		
//		
		Assert.assertTrue(result);   //result: true=pass , false=fail
		//Assert.assertFalse(result);   //result:true=fail , false=pass
//		
		
	     //softAssert=non-static method
		//after failure it will check after all method then give result pass or fail
		
		
//		String actualurl=driver.getCurrentUrl();
//		System.out.println(actualurl);
//		String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//		SoftAssert soft=new SoftAssert();
		//soft.assertEquals(actualurl, expectedurl);
			
//		soft.assertNotEquals(actualurl, expectedurl);
//		
//		soft.assertTrue(result);
		
		//soft.assertFalse(result);
		}

//	@Test
//	public void logout()
//	{
//		LogOut logout=new LogOut(driver);
//		logout.clickonpaulcolling();
//		logout.clickOnlogout();
//	}
	
	@AfterMethod
	public void failurescreenshotmethod(ITestResult result) throws IOException
	
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=Screenshot.captureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
			
		}
		extent.flush();
	}
	
	
	
	
	@AfterClass  
	private void closedriver() {
		driver.quit();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
