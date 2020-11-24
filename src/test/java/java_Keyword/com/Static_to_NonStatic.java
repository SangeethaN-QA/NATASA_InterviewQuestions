package java_Keyword.com;

public class Static_to_NonStatic {
	
	int i = 10;
	
	public void printMessage(String name1,String name2)
	{
		String name3 = name1+name2;
		System.out.println(" add two names --->" +name3);
		getMessage("india and russia both are good friends");
	}
	
	public static void getMessage(String country)
	{
		//printMessage("kalai","poorani");
		Static_to_NonStatic test = new Static_to_NonStatic();
//		test.printMessage("kalai","poorani");
		System.out.println(" non static variable --->" +test.i);
		System.out.println(" get message--->" +country);
	}
	
	public static void main(String[] args) {
		
		Static_to_NonStatic access = new Static_to_NonStatic();
		access.printMessage("Poorani", "is my best frd");
		
		Static_to_NonStatic.getMessage("India is good country");
		
	}

}
