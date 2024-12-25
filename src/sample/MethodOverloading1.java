package sample;

public class MethodOverloading1 {
	

	
	
	public int Employee(int a) {
		
		return a;
		
	
		
	}
	
	
	public String Employee(String b) {
		return b;
		
		
	}
	
	public void Employee(float c ) {
		
		c=10.2f;
		System.out.println(c);
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading1 obj = new MethodOverloading1 ();
		
	int ab = 	obj.Employee(11);
		
		
		
		System.out.println(ab);
		System.out.println(obj.Employee("Logesh"));
		
		
		//System.out.println(obj.Employee(1.5000f));
		
	}
	

}
