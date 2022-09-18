package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	
	@FindBy (xpath="//li[@class=\"oxd-userdropdown\"]")
	private WebElement paulcolling;
	
	@FindBy (linkText="Logout")
	private WebElement logout;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonpaulcolling()
	{
		paulcolling.click();
	}
	
	public void clickOnlogout()
	{
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
