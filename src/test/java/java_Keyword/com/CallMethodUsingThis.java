package java_Keyword.com;

public class CallMethodUsingThis {
	
	void printName()
	{
		System.out.println(" exec print name method");
		getName();
	}
	
	void getName()
	{
		System.out.println(" exec get name method");
	}
	
	public static void main(String[] args) {
		CallMethodUsingThis needthis = new CallMethodUsingThis();
		needthis.printName();
	}

}
