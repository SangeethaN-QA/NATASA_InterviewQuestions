package automationFramework.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EncapsulationClass {
	
	private WebDriver driver;
	private By emailID = By.xpath("//input[@id='identifierId']");
	private String email_id;
	
	public EncapsulationClass(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	
	public String getEmailID()
	{
		 email_id = driver.findElement(emailID).getAttribute("value");
		 System.out.println(" get email id ------------ > " +email_id);
		 return email_id;
	}

}
