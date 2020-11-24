package java_SeleniumQuestions;

public class ConstructorOverloading {
	
	String strTitle;
	String strLocator;
	String strButton;
	
	public ConstructorOverloading(String strTitle,String strLocator)
	{
		this.strTitle = strTitle;
		this.strLocator = strLocator;
	}
	
	public ConstructorOverloading(String strButton)
	{
		this.strButton = strButton;
	}
	
	public void printConstructorOverloading()
	{
		if(strButton==null)
		{
			System.out.println( "  '"+strTitle+"' -->  Enter --> '"+strLocator+"' ");
		}else {
			System.out.println(" '"+strButton+"' Clicked");
		}
	}

}
