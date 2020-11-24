package methodoverride.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass extends ParentClass {

WebDriver driver;
	
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
		System.out.println(" Child Class -> Yatra");
		
	}
}
