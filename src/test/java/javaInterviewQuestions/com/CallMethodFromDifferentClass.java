package javaInterviewQuestions.com;

public class CallMethodFromDifferentClass {
	
	//CallMethodFromDifferentClass different = new CallMethodFromDifferentClass();
	
	
	
	public static void main(String[] args) {
		
		InsideMethod inside = new InsideMethod();
		inside.getStringValue();
		inside.getText();
	}
	
	
	

}
