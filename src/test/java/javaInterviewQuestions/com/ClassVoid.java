package javaInterviewQuestions.com;

public class ClassVoid {
	
	public void printValue()
	{
		System.out.println("print value void method");
		
	}
	String a = "sangeethaNatarajan";
	
	public String getStringValue()
	{
		System.out.println("String return value is --- :::" +a);
		return a;
		
		
	}
	 int b = 100;
	public int getIntValue()
	{
		System.out.println("---print int value---" +b);
		return b;
	}
	
	
	public static void main(String[] args) {
		ClassVoid void_class = new ClassVoid();
		
		void_class.printValue();
		void_class.getStringValue();
		void_class.getIntValue();
	}

}
