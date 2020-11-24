package javaInterviewQuestions.com;

public class InsideMethod {
	
	public void getText()
	{
		System.out.println("get Text Method");
	}
	
	String a = "Poorani is my best frd";
	public String getStringValue()
	{
		System.out.println("-----getStringValue-----" +a);
		return a;
	}
	
	public String getAnotherMethodValue()
	{
		String b = getStringValue();
		System.out.println("-------getAnotherMethodValue-----" +b);
		return b;
	}
	
	
	
	
	public static void main(String[] args) {
		
		InsideMethod inside = new InsideMethod();
		//inside.getText();
		inside.getAnotherMethodValue();
		
	}

}
