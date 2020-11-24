package testngInterviewQuestions.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTestFile {
	
	public void equalString()
	{
		String a = "natasa";
		String b = "tech";
		
		Assert.assertEquals(a, b);
	}
	
	public void StringLengthFile()
	{
		String[] str = {"selenium","automation","bdd"};
		
		for(int i = 0;i<=str.length;i++)
		{
			System.out.println("All String values ###" +str[i]);
		}
	}
	
	@Test(expectedExceptions = {AssertionError.class,ArrayIndexOutOfBoundsException.class} )
	public void runFile()
	{
		equalString(); //java.lang.AssertionError
		StringLengthFile(); //java.lang.ArrayIndexOutOfBoundsException:
		
	}

}
