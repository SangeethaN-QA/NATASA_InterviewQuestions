package seleniumQuestions.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorsElements {

	WebDriver driver;
//	ID
//	Name
//	LinkText
//	Partial LinkText
//	Tag Name
//	Class Name
	
	
	@BeforeTest
	public void launchApplication()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	}
	
	@Test
	public void basicLocators()
	{
		driver.findElement(By.id("email")).sendKeys("sarathistudy@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass12345");
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.className("inputtext")).sendKeys("123456789");
		driver.findElement(By.tagName("button")).click();
	}
//	
//	Standard Xpath
//	Using Contains
//	Using Xpath with AND & OR
//	Using starts-with
//	Using Text in Xpath

	
	@Test
	public void xpathLocators() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sarathistudy@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("pass123456789");
		
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).sendKeys("sarathistudy@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass' or @button='Password']")).sendKeys("pass098098");
		driver.findElement(By.xpath("//a[starts-with(@data-testid,'open-registration')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
