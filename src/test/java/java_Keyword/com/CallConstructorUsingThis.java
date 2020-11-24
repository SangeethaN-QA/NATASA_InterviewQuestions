package java_Keyword.com;

public class CallConstructorUsingThis {
	
	public CallConstructorUsingThis()
	{
		this("electrical");
		System.out.println("default constrcutor");
		
	}
	
	public CallConstructorUsingThis(String dept)
	{
		//this();
		System.out.println(" parameterized constructor ---> " +dept);
		
	}
	
	public static void main(String[] args) {
		CallConstructorUsingThis constr = new CallConstructorUsingThis();
		
		
	}

}
