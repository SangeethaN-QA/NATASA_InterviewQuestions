package methodoverride.com;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchTest {
	
public static void main(String[] args) {
	
	WebElement ele = testCheck("Xpath#Locators");
	ele.click();
	
	
}


@SuppressWarnings("null")
public static WebElement testCheck(String locators)
{
	WebDriver driver = null;
	String locatorElement = StringUtils.substringBefore(locators, "#");
	WebElement ele = null ;
	switch (locatorElement) {
	case "Xpath":
		
		ele = driver.findElement(By.xpath(locatorElement));
		System.out.println("xpath");
		break;
	case "id":
		ele = driver.findElement(By.id(locatorElement));
		System.out.println("id");
		break;

	default:
		break;
	}
	return ele;
}
}
