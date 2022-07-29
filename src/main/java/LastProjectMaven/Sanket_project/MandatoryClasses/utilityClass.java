package LastProjectMaven.Sanket_project.MandatoryClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityClass 
{
	public static String fetchData(int row,int cell) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\sanke\\eclipse-workspace\\Sanket_project\\Excel Data\\frameworkdata.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet =book.getSheet("Sheet1");
		String data=sheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
	public static void screenshot(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\sanke\\eclipse-workspace\\Sanket_project\\ScreenShots\\"+screenshotName+".jpg");
		FileHandler.copy(src, des);
	}
}
