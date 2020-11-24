package testngInterviewQuestions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PriorityTestNG {

	WebDriver driver;
	
	@Test(priority = -1)
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		System.out.println("--------launchApp----------");
		
	}
	
	//-1,-2,0,1,2,
	@Test(priority = 2)
	public void userNameTest()
	{
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("natasatech@gmail.com");	
			System.out.println("------------userNameTest---------");
	}
	
	@Test(priority = 3)
	public void passwordTest()
	{
			
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
			System.out.println("----------passwordTest----------");
			
	}
//	PASSED: launchApp = -1
//	PASSED: sampleTest = 0
//	PASSED: clickonButtonTest = 1
//	PASSED: userNameTest =2
//	PASSED: passwordTest = 3
	@Test(priority = 1)
	public void clickonButtonTest()
	{
			
			driver.findElement(By.xpath("//button[@name='login']")).click();
			System.out.println("------------clickonButtonTest-----------");
	}
	
	@Test
	public void sampleTest()
	{
		System.out.println("----------sampleTest------------");
			
	}
}
