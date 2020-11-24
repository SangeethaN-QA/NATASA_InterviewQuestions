package java_OOPS.com;

public class DataHiding {
	
	private String companyName = "Info Vision Labs";
	
	public String getName()
	{
		return companyName;
		
	}
	
	public void setName(String company_name)
	{
		this.companyName = company_name;
	}
	
	public static void main(String[] args) {
		DataHiding hide = new DataHiding();
		System.out.println(" Company Name in Data hidiing class ---> " +hide.companyName);
		
		
	}

}
