package methodoverride.com;

public class MainClass {
	
	
	public static void main(String[] args) {
		
		ParentClass parent = new ParentClass();
		parent.launchApp();
//		
//		ChildClass child = new ChildClass();
//		child.launchApp();
		
		
		ParentClass upcast = new ChildClass();
		upcast.launchApp();
		
		
		
	}

}
