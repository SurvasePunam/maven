package pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

	
	@FindBy (xpath="//div[@class=\"orangehrm-employee-container\"]")
	private WebElement addemployee;
	
	@FindBy (xpath="//*[@name=\"firstName\"]")
	private WebElement fname;
	
	@FindBy (xpath="//*[@name=\"middleName\"]")
	private WebElement mname;
	
	@FindBy (xpath="//*[@name=\"lastName\"]")
	private WebElement lname;

	@FindBy (xpath="(//*[@class=\"oxd-input oxd-input--active\"])[2]")
	private WebElement eid;

	@FindBy (xpath="//*[@type=\"submit\"]")
	private WebElement savebutton;
	
	
	
	// constructor
	
	public AddEmployee(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	
	public boolean displayfname()
	{
		boolean fnamedisplay=fname.isDisplayed();
		return  fnamedisplay;
		
	}
	
	public boolean displaymname()
	{
		boolean mnamedisplay=mname.isDisplayed();
		return  mnamedisplay;
		
	}
	
	public boolean displaylname()
	{
		boolean lnamedisplay=lname.isDisplayed();
		return  lnamedisplay;
		
	}
	
	public boolean displayeid()
	{
		boolean eiddisplay=eid.isDisplayed();
		return  eiddisplay;
		
	}
	
	public void sendfirstname()
	{
		fname.sendKeys("punam");
	}
	
	public void sendmiddlename()
	{
		mname.sendKeys("Manohar");
	}
	
	public void sendlastname()
	{
		lname.sendKeys("Survase");
	}
	
	public void sendeidname()
	{
		eid.clear();
		eid.sendKeys("102");
	}
	
	public void clickOnSaveButton()
	{
		savebutton.click();
	}
	
	
	
	
	
	
	
	
	
	
}
