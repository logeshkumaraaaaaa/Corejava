package sample;

public class MethodOverrride1 extends MethodOverride {

	
	
	public void sound() {
		
		
		
		String ab = "Logesh";
		 int hashCode = ab.hashCode();
		System.out.println("First memory " + hashCode );
		
		ab="mahesh";
		int hashCode2 = ab.hashCode();
		System.out.println("Second memory"+ hashCode2);
		
	}

	
	public static void main(String[] args) {
		
		MethodOverrride1 obj = new MethodOverrride1();
		obj.sound();
		MethodOverride obj1 = new MethodOverride();
	
		obj1.sound();
		
		
		
	}
}

