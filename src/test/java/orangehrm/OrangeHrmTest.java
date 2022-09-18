package orangehrm;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pompackage.Homepage;
import pompackage.LogOut;
import pompackage.Login;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class OrangeHrmTest {
  
	public  WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();

	  }

	@BeforeClass
	  public void beforeClass() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

  @BeforeMethod
  public void login() {
	  Login login=new Login(driver);
	  login.sendusername();
	  login.sendpassword();
	  login.clickOnLoginButton();
  }
  
  @Test
  public void Homepage()
  {
	  Homepage home=new Homepage(driver);
	  home.pimIsdisplayed();
	 
	  home.sendEmployeeName();
	  home.sendEmployeeID();
	  home.sendsupervisorName();
  }

  @AfterMethod
  public void logout() {
	  
	  LogOut logout=new LogOut(driver); 
	  logout.clickonpaulcolling();
	  logout.clickOnlogout();
  }

  
  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

 
 

}
