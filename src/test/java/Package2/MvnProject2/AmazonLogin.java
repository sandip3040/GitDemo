package Package2.MvnProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLogin {
	
	@Test
	public void Login() throws InterruptedException
	{
		
	
		System.setProperty("webdriver.chrome.driver","D:\\SAN\\SanSoftwares\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String LoginURL="https://www.amazon.in";
			
		driver.get(LoginURL);
		
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.id("nav-link-accountList")).click();
		
		
		driver.findElement(By.className("nav-a nav-a-2")).click();
		
		int Count = driver.findElements(By.tagName("a")).size();
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		
		driver.findElement(By.partialLinkText("Best")).click();
		
		driver.findElement(By.xpath("//div[@id='nav-main']/div[3]/div/div/a[11]")).click();
		
		
		
		
		
		
		
		
		WebElement loginlink = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		loginlink.click();
		
		WebElement EmailId = driver.findElement(By.xpath("//input[@id='ap_email']"));
		EmailId.sendKeys("9890983639");
		
		
		WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
		ContinueButton.click();
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		Password.sendKeys("abcd@1234");
		
		WebElement LoginButton = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		LoginButton.click();
		
		Thread.sleep(15000);
		
		WebElement HelloName = driver.findElement(By.cssSelector("a#nav-link-accountList span.nav-line-1"));
		
		String UserActualName = HelloName.getText();
		
		if(UserActualName.contains("sandip"))
		{
			System.out.println("Congrts , u have successfully loged in");
		}
		else 
		{
			System.out.println("Sry , plz try again");
		}
		
	}

}
