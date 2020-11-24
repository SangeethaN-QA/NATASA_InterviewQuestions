package java_Keyword.com;

public class WithoutThisKeyword {
	
	String country1;
	String country2;
	
	public WithoutThisKeyword(String country1,String country2)
	{
		country1 = country1;
		country2 = country2;
	}
	
	void getCountry()
	{
		System.out.println("Get two country names --- > '"+country1+"' and  '"+country2+"' ");
	}
	
	
	public static void main(String[] args) {
		
		WithoutThisKeyword without = new WithoutThisKeyword("India", "Russia");
		without.getCountry();
		
		
	}

}
