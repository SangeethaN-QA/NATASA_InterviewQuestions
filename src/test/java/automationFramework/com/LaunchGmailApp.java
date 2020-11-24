package automationFramework.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchGmailApp {
	WebDriver driver;
	
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com/");
	}
	
	public void enterEmailID()
	{
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sarathisangee@gmail.com");
	}
	
	


}
