package rahulshetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmLogin {

	WebDriver driver;
	@FindBy (xpath="//input[@name=\"username\"]")
	private WebElement username;
	
	@FindBy (xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy (xpath="//button[@type=\"submit\"]")
	private WebElement loginbutton;
	
	
	


	public  OrangehrmLogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendusername(String usrname)
	{
		username.sendKeys(usrname);
	}
	
	public void sendpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		
		loginbutton.click();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
