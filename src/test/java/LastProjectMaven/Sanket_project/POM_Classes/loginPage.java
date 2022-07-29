package LastProjectMaven.Sanket_project.POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	@FindBy(xpath="//div[@class=\"IiD88i _351hSN\"]/input[@type=\"text\"]")private WebElement username;
	@FindBy(xpath="//div[@class=\"IiD88i _351hSN\"]/input[@type=\"password\"]")private WebElement password;
	@FindBy(xpath="//div[@class=\"_3wFoIb row\"]//button[@type=\"submit\"]")private WebElement loginButton;
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String user)
	{
		username.sendKeys(user);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickButton()
	{
		loginButton.click();
	}
	

}
