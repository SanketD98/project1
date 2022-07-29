package LastProjectMaven.Sanket_project.MandatoryClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseClass 
{
	public WebDriver driver;
	public void configureBrowser()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\sanke\\eclipse-workspace\\Sanket_project\\Browser Driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");		
	}

}
