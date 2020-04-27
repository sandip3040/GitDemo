package AmazonObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {

	
	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver)
	{
		
	this.driver = driver;	
		
	}
	
	By HamburgarTab = By.xpath("//div[@id='nav-belt']/div[1]/a");
	
	By AmazonLogo = By.xpath("//div[@id='nav-logo'] //a[@class='nav-logo-link']");
	
	By AllDropDown = By.xpath("//select[@id='searchDropdownBox']");
	
	By SearchTextbox= By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']");
	
	By SearchIcon = By.xpath("//form[@class='nav-searchbar']/div[2]/div/input");
	
		
}
