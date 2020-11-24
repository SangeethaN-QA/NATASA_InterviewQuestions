package seleniumQuestions.com;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class CheckAllLinks_workingORnot {

	WebDriver driver;
	public String linksName ;
	public String links ;
	@BeforeMethod
	public void lanuchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "../InterviewQuestions/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.com/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

	}



		public void CheckAllLinks() throws IOException 
		{
			
			List<WebElement> li = driver.findElements(By.tagName("a"));
			System.out.println("Links List Size ### " +li.size());
			
			if(li.size()>1)
			{
				for(int i=0;i<li.size();i++)
				{
					linksName = li.get(i).getAttribute("href");
					System.out.println(" '"+i+"' Links Name is ### " +linksName);
				//	getStatus(linksName);
					
					
				}
				
				
			}
	
			
	 	}

		@AfterTest
		public void closeBrowser()
		{
			driver.close();
		}
		
		public static String getStatus(String url) throws IOException {
			 
			String result = "";
			int code = 200;
			try {
				URL siteURL = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
				connection.setRequestMethod("GET");
				connection.setConnectTimeout(3000);
				connection.connect();
	 
				code = connection.getResponseCode();
				if (code == 200) {
					result = "-> Green <-\t" + "Code: " + code;
					;
				} else {
					result = "-> Yellow <-\t" + "Code: " + code;
				}
			} catch (Exception e) {
				result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();
	 
			}
			System.out.println(url + "\t\tStatus:" + result);
			return result;
		}
}

