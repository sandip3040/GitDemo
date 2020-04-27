package FBTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import FBObjectRepository.OR_HomePage;
import FBObjectRepository.OR_LoginPage;

public class TC_LoginFlow {
	
	
	@Test
	public void Login() throws InterruptedException
	{
			
		System.setProperty("webdriver.chrome.driver","D:\\SAN\\SanSoftwares\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String LoginURL="https://www.facebook.com";
		driver.get(LoginURL);
		
		driver.manage().window().maximize();
		
	
		
		OR_LoginPage lp = new OR_LoginPage(driver);
				
		lp.UsernameMethod().sendKeys("sandip.j3747@gmail.com");
		lp.passwordMethod().sendKeys("avika@3747");
		lp.LoginButtonMethod().click();
		
		/*Thread.sleep(15000);
		
		
		OR_HomePage hp = new OR_HomePage(driver);
		
		hp.SearchTextBoxMethod().sendKeys("avika jadwal");
		hp.SearchTextBoxMethod().click();*/
		
	}
}
