package KitePOm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KitePOm.UtilityProp;
import KitePOm.UtilityProp;

public class BaseProp 
{
	protected static WebDriver driver = null;  //= null  ==>erase
	
	public void OpenBrowser(String name) throws IOException              ///

	{
		 if(name.equals("firefox"))
		  {
		     System.setProperty("webdriver.gecko.driver" , "E:\\Subodh Software Testing\\Java\\Selenium\\geckodriver.exe");
			
		     driver = new FirefoxDriver();
		  
		  }
		    
		  else if(name.equals("chrome"))
		  {
			 System.setProperty("webdriver.chrome.driver" , "E:\\Subodh Software Testing\\Java\\Selenium\\chromedriver.exe");

		     driver = new ChromeDriver();
		   
		  }
		
		
		
		//System.setProperty("webdriver.chrome.driver" , "E:\\Subodh Software Testing\\Java\\Selenium\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().window().maximize();                               //my added script
		driver.get(UtilityProp.readDatafromPropertyFile("URL"));
	}
	
}

