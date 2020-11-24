package java_SeleniumQuestions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchCase {

	WebDriver driver;
	public String keyLocator;

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
	public void performFaceBookSteps()
	{
		String emailID = "XPATH#//input[@id='email']";
		String password = "ID#pass";
		String loginBtn = "NAME#login";
		String forgotPassword = "LINKTEXT#Forgotten password?";
		String classMobile = "CLASSNAME#inputtext";
		
		checkLocators(emailID);
		checkLocators(password);
		checkLocators(loginBtn);
		checkLocators(forgotPassword);
		checkLocators(classMobile);
		
	}


	public void checkLocators(String strLocator)
	{

		keyLocator = StringUtils.substringBefore(strLocator, "#");
		System.out.println(" key ---->" +keyLocator);
		strLocator = StringUtils.substringAfter(strLocator, "#");
		System.out.println(" value ---->" +strLocator);


		switch(keyLocator)
		{
		
		case "XPATH":
			driver.findElement(By.xpath(strLocator)).sendKeys("sarathistudy@gmail.com");
			System.out.println("xpath is executed-->enter email id");
			break;
		case "ID":
			driver.findElement(By.id(strLocator)).sendKeys("1234567Password");
			System.out.println("id is executed--> enter password");
			break;
		case "NAME":
			driver.findElement(By.name(strLocator)).click();
			System.out.println("NAME is excueted-->click login btn");
			break;
		case "CLASSNAME":
			driver.findElement(By.className(strLocator)).sendKeys("1234567890");
			System.out.println("classname is executed--> enter mobile number");
			break;
		case "LINKTEXT":
			driver.findElement(By.linkText(strLocator)).click();
			System.out.println("linktext is executed---> forgot password clicked");
			break;
		case "PARTIALLINK":
			System.out.println("test");
			break;
		default:
			System.out.println("default statement");
			break;


		}


	}


























}
