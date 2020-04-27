package Package2.MvnProject2;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonFooterFirstCol {

	@Test
	public void FooterAboutUsLinks() throws InterruptedException
	{
		
		//System.out.println("Hi I am in amazon ");
		System.setProperty("webdriver.chrome.driver","D:\\SAN\\SanSoftwares\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		/*driver.manage().deleteAllCookies();*/
		
		Thread.sleep(3000);
		
		
		int totallinkcountHomepage=driver.findElements(By.tagName("a")).size();
		System.out.println("Total Link Count of Home page : "+totallinkcountHomepage);
		
		
		WebElement SubDriverFooter = driver.findElement(By.cssSelector("div.navLeftFooter.nav-sprite-v1"));
		int TotalLinkCountFooter = SubDriverFooter.findElements(By.tagName("a")).size();
		System.out.println("Total Link Count of Footer  : "+TotalLinkCountFooter);
		
		WebElement SubDriverFooter1 = driver.findElement(By.xpath("//*[contains(text(),'Get to Know Us')]/parent::div"));
		int TotalCountFooterAboutUs=SubDriverFooter1.findElements(By.tagName("a")).size();
		System.out.println("Total link count of Footer About us :"+TotalCountFooterAboutUs );
		
		for(int i=0;i<TotalCountFooterAboutUs;i++)	
		{
			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			SubDriverFooter1.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);	
		}
	
		
	Set<String> abc= driver.getWindowHandles();
	
	Iterator<String> it = abc.iterator();
	
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getTitle());
	}
		
		
		
}
	
	
	
}
