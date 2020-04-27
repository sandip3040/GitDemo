package AmazonObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonLoginPage {

	
	WebDriver driver;
	
	public AmazonLoginPage(WebDriver driver)
	{
		
	this.driver = driver;	
		
	}
	
	
	
	
	By mobileTextBox = By.xpath("//input[@id='ap_email']");
	
	By CountinueButton = By.xpath("//input[@id='continue']");
	
    By Password = By.xpath("//input[@id='ap_password']");
    
    By LoginButton = By.xpath("//input[@id='signInSubmit']");
    
    
    public WebElement mobileTextBoxMethod()
    {
    	return driver.findElement(mobileTextBox);
    	
    }
    
    public WebElement CountinueButtonMethod()
    {
    	return driver.findElement(CountinueButton);
    	
    }
    
    public WebElement PasswordMethod()
    {
    	return driver.findElement(Password);
    	
    }
    
    public WebElement LoginButtonMethod()
    {
    	return driver.findElement(LoginButton);
    	
    }
    
    
	
}
