package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy (xpath="//*[@placeholder=\"Username\"]")
	private WebElement username;
	
	@FindBy (xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	private WebElement loginbutton;
	
	public Login (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendusername()
	{
		username.sendKeys("Admin");
	}
	
	public void sendpassword()
	{
		password.sendKeys("admin123");
	}
	
	public boolean clickOnLoginButton()
	{
		//it will check after login loginbutton is displayed or not
		boolean result=loginbutton.isDisplayed();
		loginbutton.click();
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
