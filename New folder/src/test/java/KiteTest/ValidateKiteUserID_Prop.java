package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KitePOm.BaseProp;
import KitePOm.KiteHomePage;
import KitePOm.KiteLoginPage;
import KitePOm.KitePinPage;
import KitePOm.UtilityProp;

@Listeners(KiteTest.Listener.class)

public class ValidateKiteUserID_Prop extends BaseProp{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
//	String TCID = "111";           // Listner last
   
	@Parameters("BrowserName")
	
   @BeforeClass
// public void launchBrowser(String name) throws IOException
   public void launchBrowser() throws IOException
   {
//  	 OpenBrowser(name);
  	 OpenBrowser("chrome");
//  	 OpenBrowser("firefox");
//  	 
  	 login = new KiteLoginPage(driver);
  	 pin = new KitePinPage(driver);
  	 home = new KiteHomePage(driver);
  			 
   }
	
	@BeforeMethod 
	public void loginToKite() throws IOException
	{
	  login.sendUserName(UtilityProp.readDatafromPropertyFile("UN"));
	  login.sendPassword(UtilityProp.readDatafromPropertyFile("PWD"));
	  login.clickOnLoginButton();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	  pin.sendPin(UtilityProp.readDatafromPropertyFile("PIN"));
	 // pin.sendPin(UtilityProp.captureScreenshot(driver, null));        my work
	  
	  pin.clickOnContinueButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
	}
	
	@Test
   public void ValidateUserID() throws IOException 
   {
		Assert.assertEquals(home.getActulUserID(), UtilityProp.readDatafromPropertyFile("UN"), "Actual and Expected User ID are not matching, TC is failed");
		Reporter.log("Actual and Expected User ID are matching, TC is Passed", true);
//		Assert.fail();
//		UtilityProp.captureScreenshot(driver, TCID);
 	  
   }
	
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
		home.logOut();
	}
	
    @AfterClass
    public void closeBrowser()
	{
    	driver.close();
		
	}
}
