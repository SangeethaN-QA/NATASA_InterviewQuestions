package java_OOPS.com;

public class Main_A_AbstractClass {
	
	public static void main(String[] args) {
		
	//	B_AbstractClass bb = new B_AbstractClass();
		
		
		A_AbstractClass withoutAbstract = new A_WithoutAbstractClass();
		
		withoutAbstract.print_Value();
		withoutAbstract.print_Message();
		
	}

}
