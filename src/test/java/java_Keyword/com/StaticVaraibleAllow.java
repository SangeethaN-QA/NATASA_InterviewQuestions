package java_Keyword.com;

public class StaticVaraibleAllow {
	
	//Are static local variables allowed in Java?
			
	//		int year = 2000;
	// static + local = staticlocal variable
			 static int year = 199;
			 
			 public void checkvalue()
			 {
				 int i = 2000;
				 int a = 4;
				 System.out.println("----local variable-->" +i);
				 System.out.println("----static varaiable--->" +year);
			 }
			 
			public static void main(String[] args) {
				
				StaticVaraibleAllow staticall = new StaticVaraibleAllow();
				staticall.checkvalue();
				
			}
}
