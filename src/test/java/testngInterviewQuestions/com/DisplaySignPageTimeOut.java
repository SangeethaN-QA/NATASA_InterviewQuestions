package testngInterviewQuestions.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisplaySignPageTimeOut {
	
	WebDriver driver;
	
	@Test//(timeOut =  1000)
	public void YatraSignPage()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
	}

}
