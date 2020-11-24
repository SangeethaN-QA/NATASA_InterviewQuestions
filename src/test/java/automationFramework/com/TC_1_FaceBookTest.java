package automationFramework.com;

import org.testng.annotations.Test;

import base.com.StartTest;

public class TC_1_FaceBookTest extends StartTest{
	
	@Test
	public void TC1_FaceBookLogin()
	{
		FaceBookPage fb = new FaceBookPage(getDriver());
		fb.loginFaceBook();
	}

}
