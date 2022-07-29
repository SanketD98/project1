package LastProjectMaven.Sanket_project.POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage 
{
	@FindBy(xpath="//div[@class=\"_1psGvi _3BvnxG\"]")private WebElement user;
	@FindBy(xpath="(//ul[@class=\"pO9syL undefined\"]/li)[10]")private WebElement logoutButton;

	public mainPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateUser()
	{
		String str=user.getText();
		return str;
	}
	
	public void logOut(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(user).perform();;
		a.moveToElement(logoutButton).click().build().perform();
		
	}
}
