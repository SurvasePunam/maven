package TestNGlearning.MavenProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public WebDriver driver;
	
	@BeforeSuite
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@BeforeClass
	public void BasicSetup() {
       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
       driver.manage().window().maximize();
       ChromeOptions option=new ChromeOptions();
       option.addArguments("--disable-notifications");
		
	}
	@BeforeMethod
	public void LaunchApp() {
		driver.get("https://www.facebook.com/");
		
	}
	@BeforeTest
	public void Login() {
		System.out.println("Login Facebook");
		
	}
	@Test
	public void verifyUserProfile() {
		System.out.println("Verify that user is logged into the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from facebook");
		
	}
	
	@AfterClass
	public void generateReport(){
		System.out.println("log test execution/generate test report");
	}
	
	@AfterTest
	public void closeDriverInstance() throws InterruptedException{
		driver.close();
	}
		
	@AfterSuite
	public void cleanUp() {
		System.out.println("Perform clean up activity");
	}

}
