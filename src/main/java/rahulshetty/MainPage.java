package rahulshetty;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	WebDriver driver;
	@FindBy (xpath="//*[@value=\"radio1\"]")
	private WebElement radiobutton1;
	
	@FindBy (xpath="//*[@name=\"radioButton\"]")
	private List<WebElement> allradiobuttons;
	
	@FindBy (xpath="//*[@placeholder=\"Type to Select Countries\"]")
	private WebElement countrydropdown;
	
	@FindBy (xpath="dropdown-class-example")
	private WebElement optionsdropdown;
	
	@FindBy (xpath="//*[@type=\"checkbox\"]/parent::label")
	private List<WebElement> checkboxes;
	
	
	public MainPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean clickOnradiobutton1()
	{
		boolean displayradiobutton1=radiobutton1.isDisplayed();
		radiobutton1.click();
		return displayradiobutton1;
	}
	
	public boolean isselectedradiobutton1()
	{
		boolean selectedradiobutton1=radiobutton1.isSelected();
		
		return selectedradiobutton1;
	}
	
	public void clickOnallradiobuttons()
	{
		for(WebElement radiobutton:allradiobuttons)
		{
			radiobutton.click();
		}
	}
	
	public void selectByChoice()
	{
		for(WebElement buttonByChoice:allradiobuttons)
		{
			String str=buttonByChoice.getAttribute("value");
			if(str.equals("radio1") || str.equals("radio3"))
			{
				buttonByChoice.click();
			}
		}
	}
	
	
	public void selectcountry()
	{
		Actions at=new Actions(driver);
		at.moveToElement(countrydropdown).click().perform();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
