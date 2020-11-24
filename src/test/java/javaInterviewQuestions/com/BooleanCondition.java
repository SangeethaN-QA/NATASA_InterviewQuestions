package javaInterviewQuestions.com;

public class BooleanCondition {
	
	public boolean checkCondition()
	{
		String a = "mani";
		String b = "sangeetha";
		if(a.equals(b))
		{
			System.out.println("true both strings are equals");
			return true;
		}else {
			System.out.println("false both strings are not equals");
			return false;
		}
	}
	
	public static void main(String[] args) {
		BooleanCondition bool = new BooleanCondition();
		bool.checkCondition();
		
	}

}
