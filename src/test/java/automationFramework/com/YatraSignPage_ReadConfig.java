package automationFramework.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YatraSignPage_ReadConfig {
	
	WebDriver driver;
	
	ReadConfig read = new ReadConfig();
	
	
	@BeforeTest
	public void launchYatraApp()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String app_url = read.get_Applicationurl();
		driver.get(app_url);
	}
	
	@Test
	public void yatraSignInPage() throws IOException, InterruptedException
	{
		String user_name = read.get_Username();
		driver.findElement(By.xpath("//input[@name='login-input']")).sendKeys(user_name);
		
		driver.findElement(By.xpath("//button[@id='login-continue-btn']")).click();
		
		Thread.sleep(4000);

		String pass_word = read.get_Password();
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(pass_word);
		
		driver.findElement(By.xpath("//button[@id='login-submit-btn']")).click();
		
		
	}

}
