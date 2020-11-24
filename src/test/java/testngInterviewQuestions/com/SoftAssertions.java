package testngInterviewQuestions.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

WebDriver driver;
	
	@BeforeTest
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
		
	}
	
	String expectedErrorMsg = "You have an invalid Email Id. Please try again.";
	@Test
	public void InvalidLoginErrorMsg()
	{
		driver.findElement(By.xpath("//input[@name='login-input']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'You have entered an invalid Email Id. Please try again.')]"));
		String actualErrorMsg = ele.getText();
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualErrorMsg, expectedErrorMsg);
		System.out.println("Soft Assertion is successfully completed ### " +actualErrorMsg);
		
	}

}
