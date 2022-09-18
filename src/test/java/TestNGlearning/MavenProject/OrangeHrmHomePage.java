package TestNGlearning.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmHomePage {

	public WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	@BeforeClass
	public void openurl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
	}
	@Test
	public void homepage()
	{
		boolean leave=driver.findElement(By.xpath("//*[text()='Leave']")).isDisplayed();
		System.out.println(leave);
		boolean recruitment = driver.findElement(By.xpath("//*[text()='Recruitment']")).isDisplayed();
		System.out.println(recruitment);
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]")).click();
		driver.findElement(By.xpath("//*[text()='Full-Time Permanent']")).click();
		driver.findElement(By.xpath("//div[text()='Current Employees Only']")).click();
		driver.findElement(By.xpath("//*[text()='Current and Past Employees']")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"Type for hints...\"]")).sendKeys("punam survase");
	    driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("101");
	    driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[2]")).sendKeys("Chandrachur Banerjee");
	    
	
	}
	
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.xpath("//*[text()='Paul Collings']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
	@AfterClass
	public void driverclose()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
