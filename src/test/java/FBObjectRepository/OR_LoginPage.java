package FBObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OR_LoginPage {

	
	WebDriver driver;
	
	public OR_LoginPage(WebDriver driver)
	{
		
	this.driver = driver;	
	PageFactory.initElements(driver, this);
		
	}
	
	/*
	By Username = By.xpath("//input[@id='email']");
	
	By password = By.xpath("//input[@id='pass']");
	
	By LoginButton= By.xpath("//label[@id='loginbutton']/input");
	*/
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Username;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	
	@FindBy(xpath="//label[@id='loginbutton']/input")
	WebElement LoginButton;
	
	public WebElement passwordMethod()
	{
	   /*return driver.findElement(password);	*/
		return password;
	}
	
	public WebElement LoginButtonMethod()
	{
	  // return driver.findElement(LoginButton);
		return LoginButton;
	}


	public WebElement UsernameMethod() {
		// TODO Auto-generated method stub
		//return driver.findElement(Username);
		return Username;
		
	}
	
}	
