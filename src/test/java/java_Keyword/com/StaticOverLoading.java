package java_Keyword.com;

public class StaticOverLoading {
	
	public static void getvalue(int a,int b)
	{
		int c = a+b;
		System.out.println(" add two values--->" +c);
	}
	
	public static void getvalue(int a,int b,int c)
	{
		int d = a + b + c;
		System.out.println( "add three values---->" +d);
	}
	
	public static void main(String[] args) {
		
		StaticOverLoading.getvalue(10, 10);
		StaticOverLoading.getvalue(10, 10, 10);
		
		
	}
	

}
