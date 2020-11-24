package java_OOPS.com;

public class Main_AbstractClass {
	
	static Super_AbstractClass abs_a;
	
	public static void main(String[] args) {
		
		abs_a = new SubClass_A();//upcasting
		abs_a.print_CollegeName();
		abs_a.print_CompanyName();
		
		abs_a = new SubClass_B();
		abs_a.print_CompanyName();
		abs_a.print_CollegeName();
		
	}

}
