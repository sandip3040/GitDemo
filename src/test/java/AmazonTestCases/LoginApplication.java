package AmazonTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AmazonObjectRepository.AmazonLoginPage;

public class LoginApplication {

	
	@Test
	public void Login()
	{
			
		System.setProperty("webdriver.chrome.driver","D:\\SAN\\SanSoftwares\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String LoginURL="https://www.amazon.in";
		driver.get(LoginURL);
		
		driver.manage().window().maximize();
		
		
		AmazonLoginPage LP= new AmazonLoginPage(driver);
		
		LP.mobileTextBoxMethod().sendKeys("9890983639");
		
		LP.CountinueButtonMethod().click();
		
		LP.PasswordMethod().sendKeys("abcd@3040");
		
		LP.LoginButtonMethod().click();
		
		
		
		
		
	}
	
	
	
	
	
}
