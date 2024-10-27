package KitePOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1. variable
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	//2. Constuctor
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	
	public void validateUserName(String ExpUserID)
	{
		String expextedUserName= ExpUserID;
		String actualUserName = userID.getText();
		
//		if(expextedUserName.equals(actualUserName))
//		{
//			System.out.println("Actual and Expected User Id are matching = TC is passed");
//	    }
//		else 
//		{
//			System.out.println("Actual and Expected User Id are not matching = TC is failed");
//	    }
	}
	
	//to get actual userName
	
	public String getActulUserID()
	{
		String actual_UID = userID.getText();
		return actual_UID;
	}
	
	public void logOut() throws InterruptedException
	{
		userID.click();
		Thread.sleep(200);
		logOutButton.click();
	}

}


