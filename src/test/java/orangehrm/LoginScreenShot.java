package orangehrm;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pompackage.Homepage;
import pompackage.LogOut;
import rahulshetty.OrangehrmLogin;
import utility.Parametrization;
import utility.Pojo;
import utility.Screenshot;



public class LoginScreenShot extends Pojo {

	WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;
	
	@BeforeTest
	public void report()
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./test-output/loginscreenshot.html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
	    logger=extent.createTest("loginWithCorrectCredential");
	    logger=extent.createTest("loginwithWrongCredential");
 
		
	}
	
	@BeforeClass 
	public void browserSetup()
	{
		WebDriver driver=openChromeBrowser();
		this.driver=driver;
	}
	
	@Test()
	public void loginWithCorrectCredential() throws EncryptedDocumentException, IOException
	{
		OrangehrmLogin lgn=new OrangehrmLogin(driver);
		lgn.sendusername(Parametrization.loginexceldata(1, 0));
		lgn.sendpassword(Parametrization.loginexceldata(1, 1));
		lgn.clickOnLoginButton();
		
		LogOut logout=new LogOut(driver);
		logout.clickonpaulcolling();
		logout.clickOnlogout();
		Screenshot.captureScreenshot(driver);
		
	}
	
	@Test(priority=1)
	public void loginwithWrongCredential() throws EncryptedDocumentException, IOException
	{
		OrangehrmLogin lgnwrong=new OrangehrmLogin(driver);
		lgnwrong.sendusername(Parametrization.loginexceldata(2, 0));
		lgnwrong.sendpassword(Parametrization.loginexceldata(2, 1));
		lgnwrong.clickOnLoginButton();
		
		Homepage home=new Homepage(driver);
		home.sendEmployeeName();
		Screenshot.captureScreenshot(driver);
		
	}
	
	@AfterMethod
	public void takescreenshot(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String Temp=Screenshot.captureScreenshot(driver);
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(Temp).build());
		}
		
		extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
