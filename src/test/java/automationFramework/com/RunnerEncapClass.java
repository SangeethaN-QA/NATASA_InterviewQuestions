package automationFramework.com;

import org.testng.annotations.Test;

public class RunnerEncapClass extends LaunchGmailApp {
	
	@Test
	public void runnerEncap()
	{
		//launchApp();
		enterEmailID();
		EncapsulationClass encap = new EncapsulationClass(driver);
		encap.getEmailID();
		
	}
	
	
	

}
