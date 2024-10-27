package KitePOm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//1..data members / Variable                           // Data member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(id ="userid" ) private WebElement userName;                              
	@FindBy(id ="password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private  WebElement loginButton;
	
	//2. Constructor                                                     //Initialize within a constructor with access level public using pagefactory 

	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3. Methods                                                                     //Utilize within a method with access level public
	
	public void sendUserName(String username)
	{
		userName.sendKeys(username);
	}
	
	public void sendPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	

}
