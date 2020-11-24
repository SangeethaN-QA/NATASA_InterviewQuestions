package java_Keyword.com;

public class ConstructorChain {
	
	String companyName;
	String studentName;
	String deptname;
	int studentmark;
	
	public ConstructorChain(String companyName,String studentName,String deptname)
	{
		this.companyName = companyName;
		this.studentName = studentName;
		this.deptname = deptname;
		
	}
	
	public ConstructorChain(String companyName,String studentName,String deptname,int studentmark)
	{
		this(companyName,studentName,deptname);
		this.studentmark = studentmark;
		
	}
	
	void display()
	{
		System.out.println(" get values ---> '"+companyName+"' and '"+studentName+"'  and  '"+deptname+"' and '"+studentmark+"' ");
	}
	
	
	public static void main(String[] args) {
		ConstructorChain chain = new ConstructorChain("InfoVisionLabs", "Sangeetha", "CSE");
		chain.display();
		ConstructorChain chain1  = new ConstructorChain("", "", "", 99);
		chain1.display();
		
		
	}

}
