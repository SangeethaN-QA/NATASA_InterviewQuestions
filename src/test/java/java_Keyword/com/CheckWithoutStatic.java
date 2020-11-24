package java_Keyword.com;

public class CheckWithoutStatic {
	
	
	int year = 2000;
	
	public CheckWithoutStatic()
	{
		year++;
		System.out.println(" get next to next year --> " +year);
	}

	
	public static void main(String[] args) {
		CheckWithoutStatic withoutstatic1 = new CheckWithoutStatic();
		CheckWithoutStatic withoutstatic2 = new CheckWithoutStatic();
		CheckWithoutStatic withoutstatic3 = new CheckWithoutStatic();
		CheckWithoutStatic withoutstatic4 = new CheckWithoutStatic();
		
		
		
	}
}
