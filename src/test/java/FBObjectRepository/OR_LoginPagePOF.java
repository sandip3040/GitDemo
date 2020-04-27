package FBObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OR_LoginPagePOF {

	
	WebDriver driver;
	
	public OR_LoginPagePOF(WebDriver driver)
	{
		
	this.driver = driver;	
		
	}
	
	
	By Username = By.xpath("//input[@id='email']");
	
	By password = By.xpath("//input[@id='pass']");
	
	By LoginButton= By.xpath("//label[@id='loginbutton']/input");
	
	
	
	/*public WebElement UsernameMethod()
	{
	   return driver.findElement(Username);	
	}
	*/
	
	public WebElement passwordMethod()
	{
	   return driver.findElement(password);	
	}
	
	public WebElement LoginButtonMethod()
	{
	   return driver.findElement(LoginButton);	
	}


	public WebElement UsernameMethod() {
		// TODO Auto-generated method stub
		return driver.findElement(Username);	
	}
	
}	
