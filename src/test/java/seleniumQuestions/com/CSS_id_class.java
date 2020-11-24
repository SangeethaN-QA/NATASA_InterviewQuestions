package seleniumQuestions.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CSS_id_class {
	
	WebDriver driver;
	
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
	public void CSSSelector()
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.cssSelector("select#day option:nth-of-type(19)")).click();
		driver.findElement(By.cssSelector("select#month option:last-child")).click();
		
		
	}
	
	

}
