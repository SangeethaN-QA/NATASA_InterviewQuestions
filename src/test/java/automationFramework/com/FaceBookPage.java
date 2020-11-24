package automationFramework.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.com.BaseClass;
import java_SeleniumQuestions.ConstructorOverloading;

public class FaceBookPage extends BaseClass{

	public FaceBookPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	ConstructorOverloading constructorOverload;
	
	public void loginFaceBook()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("natasatech@gmail.com");	
		constructorOverload = new ConstructorOverloading("facebookLogin", "email");
		constructorOverload.printConstructorOverloading();
			
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456789");
		constructorOverload = new ConstructorOverloading("facebookLogin", "pass");
		constructorOverload.printConstructorOverloading();
			
		driver.findElement(By.xpath("//button[@name='login']")).click();
		constructorOverload = new ConstructorOverloading("login");
		constructorOverload.printConstructorOverloading();
			
		
	}

}
