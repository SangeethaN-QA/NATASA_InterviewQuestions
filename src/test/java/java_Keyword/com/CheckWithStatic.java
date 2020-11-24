package java_Keyword.com;

public class CheckWithStatic {

	
	static int year = 2000;
	
	public CheckWithStatic()
	{
		year++;
		System.out.println(" get next to next year --> " +year);
	}
	
	public static void main(String[] args) {
		
		CheckWithStatic withstatic1 = new CheckWithStatic();
		CheckWithStatic withstatic2 = new CheckWithStatic();
		CheckWithStatic withstatic3 = new CheckWithStatic();
		CheckWithStatic withstatic4 = new CheckWithStatic();
		
	}
}
