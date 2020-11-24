package seleniumQuestions.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DifferenceFollowing_Descendant {

	WebDriver driver;

	
	@Test
	public void differnce()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iPhone 11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		List<WebElement> following = driver.findElements(By.
				xpath("//div[contains(@data-id,'MOB')]/following::div[contains(text(),'Apple iPhone 11')]"));
		System.out.println("The Following Text Value size ###" +following.size());
		
		if(following.size()>1)
		{
			for(int i=0;i<following.size();i++)
			{
				System.out.println(" Following Text ###" +following.get(i).getText());
			}
		}
		
		
		
		List<WebElement> following_sibling = driver.findElements(
				By.xpath("//span[contains(text(),'Showing 1 – 24 of 74 results for')]/following-sibling::div/span/following-sibling::div"));
		System.out.println("The following_sibling Text Value size ###" +following_sibling.size());
		
		if(following_sibling.size()>1)
		{
			for(int i=0;i<following_sibling.size();i++)
			{
				System.out.println(" following_sibling Text ###" +following_sibling.get(i).getText());
			}
		}
		
		
		


	}

}
