package java_Keyword.com;

public class NoNeedThis {
	
	String countryname1;
	String countryname2;
	
	public NoNeedThis(String country1,String country2)
	{
		countryname1 = country1;
		countryname2 = country2;
	}
	
	void getCountry()
	{
		System.out.println("Get two country names --- > '"+countryname1+"' and  '"+countryname2+"' ");
	}
	
	
	public static void main(String[] args) {
		
		NoNeedThis need = new NoNeedThis("India", "Russia");
		need.getCountry();
		
		
	}

}
