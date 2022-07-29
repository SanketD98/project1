package LastProjectMaven.Sanket_project.testClass;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LastProjectMaven.Sanket_project.MandatoryClasses.baseClass;
import LastProjectMaven.Sanket_project.MandatoryClasses.utilityClass;
import LastProjectMaven.Sanket_project.POM_Classes.loginPage;
import LastProjectMaven.Sanket_project.POM_Classes.mainPage;

public class testClass_screenshots_of_Failed_TestCase extends baseClass
{
	loginPage lp;
	mainPage mp;
	XSSFSheet sheet;
	@BeforeClass
	public void openApp()
	{
		configureBrowser();
		lp=new loginPage(driver);
		mp=new mainPage(driver);	
	}
	
	@BeforeMethod
	public void loginApp() throws IOException
	{
		lp.enterUsername(utilityClass.fetchData(0,0));
		lp.enterPassword(utilityClass.fetchData(0, 1));
		lp.clickButton();
	}
	
	@Test
	public void validateuser() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		String actual   = mp.validateUser();
		//String expected = utilityClass.fetchData(0, 2);
		String expected ="Mahesh";
		Assert.assertEquals(actual, expected);
	}
	
	@AfterMethod()
	public void logoutApp(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			utilityClass.screenshot(driver,result.getName());
		}
		mp.logOut(driver);		

	}

	@AfterClass
	public void closeApp() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		driver=null;
		mp=null;
		lp=null;
		sheet=null;
	}
}

