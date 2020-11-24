package base.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	private final int TimeOut = 10;
	protected static WebDriver driver;
	private WebDriverWait wait;
	
	public BaseClass(WebDriver driver)
	{
		BaseClass.driver = driver;
		wait = new WebDriverWait(driver, TimeOut);
		
		
	}
	
	protected void waitForVisibleElement(By locator) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	
	
	

}
