package yatralogin.com;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC1_YatraLogin {
	
	public String emaildiXpath = "//input[@id='login-input']";
	public String continueButtonXpath = "//button[@id='login-continue-btn']";
	public String errorMsg = "//p[contains(text(),'You have entered an invalid Email Id. Please try again.')]";
	
	@Test
	public void TC1_YatraLoginTestCase() 
	{
		YatraLoginPage yatralogin = new YatraLoginPage();
		yatralogin.launchYatraApp();
		yatralogin.enterInvalidEmailid(emaildiXpath);
		yatralogin.clickonContinueButton(By.xpath(continueButtonXpath));
		String getErrorMsg = yatralogin.getElementText(errorMsg).getText();
		System.out.println(" get error msg ####" +getErrorMsg);
		yatralogin.getDriver().close();
		
		
		
	}

}
