package yatralogin.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraLoginPage {
	WebDriver driver;
	
	

	public void launchYatraApp()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://secure.yatra.com/social/common/yatra/signin.htm");
	}
	
	public void enterInvalidEmailid(String strXpath)
	{
		driver.findElement(By.xpath(strXpath)).sendKeys("abced");
	}
	
	public void clickonContinueButton(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public WebElement getElementText(String strXpath)
	{
		WebElement ele = driver.findElement(By.xpath(strXpath));
		//ele.getText();
		return ele;
		
	}
	
	public WebDriver getDriver()
	{
		return driver;
		
	}

}
