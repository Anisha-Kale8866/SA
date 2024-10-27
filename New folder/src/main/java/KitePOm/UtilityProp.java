package KitePOm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp {
	
	public static String readDatafromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\ProjectM_Mav\\myProperty.properties");
		
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
	
	public static void captureScreenshot(WebDriver driver, String TCID) throws IOException                                           ////added more s
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);                                      
		File dest = new File("E:\\Subodh Software Testing\\Screenshot ST\\Screenshot"+TCID+".png");
		FileHandler.copy(src, dest);
		
	}
}
