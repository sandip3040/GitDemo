package FBObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OR_HomePage {

	WebDriver driver;
	
	public OR_HomePage(WebDriver driver)
	{
		
	this.driver = driver;	
		
	}
	
	
	By SearchTextBox = By.xpath("//input[@class='_1frb']");
	
	By SearchButton = By.xpath("//div[@id='js_1a']/form/button");
	
	
	public WebElement SearchTextBoxMethod()
	{
		return driver.findElement(SearchTextBox);
		
	}
	
	

	public WebElement SearchButtonMethod()
	{
		return driver.findElement(SearchTextBox);
		
	}
	
	
}
