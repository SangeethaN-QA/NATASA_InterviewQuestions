package java_Keyword.com;

public class WithThisKeyword {
	
	String country1;
	String country2;
	
	public WithThisKeyword(String country1,String country2)
	{
		this.country1 = country1;
		this.country2 = country2;
	}
	
	void getCountry()
	{
		System.out.println("Get two country names --- > '"+country1+"' and  '"+country2+"' ");
	}
	
	
	public static void main(String[] args) {
		
		WithThisKeyword with = new WithThisKeyword("India", "Russia");
		with.getCountry();
		
		
	}

}
