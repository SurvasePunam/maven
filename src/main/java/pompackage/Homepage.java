package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	WebDriver driver;
	@FindBy (xpath="//*[text()='Leave']")
	private WebElement leave;
	
	@FindBy (xpath="//*[text()='Recruitment']")
	private WebElement recruitment;	
	
	
	@FindBy (xpath="//*[@placeholder=\"Type for hints...\"]")
	private WebElement employeename;
	
	@FindBy (xpath="(//*[contains(@class,'oxd-input oxd')])[2]")
	private WebElement employeeid;
	
	@FindBy (xpath="(//*[@placeholder=\"Type for hints...\"])[2]")
	private WebElement supervisorname;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	
	@FindBy (xpath="//div[@class=\"orangehrm-header-container\"]/button")
	private WebElement add;
	
	
	
	
	
	public Homepage (WebDriver driver)
	{
		this.driver=driver;       //assign local driver value to global driver
		PageFactory.initElements(driver, this);
			
	}
	
	public boolean leaveIsDisplayed()
	{
		boolean leavedisplay=leave.isDisplayed();
		return leavedisplay;
	}
		
	public boolean recuitmentIsDisplayed()
	{
		boolean recruitmentdisplay=recruitment.isDisplayed();
		return recruitmentdisplay;
	}	
	
	public boolean pimIsdisplayed()
	{
		boolean pimdisplay=pim.isDisplayed();
		return pimdisplay;
	}
	
			
	public void sendEmployeeName()
	{
		employeename.sendKeys("punam Survase");
	}
		
	public void sendEmployeeID()
	{
		employeeid.sendKeys("101");
	}	
		
	public void sendsupervisorName()
	{
		supervisorname.sendKeys("Chandrachur Banerjee");
	}
	
	

	public void ClickOnAdd()
	{
		add.click();
	}
}




















