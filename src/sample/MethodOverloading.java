package sample;

public class MethodOverloading {
	
	public  int number(int a) {
		 return a;
		
	}
	 
	public String number (String value) {
		 return value;
		 	 }
	 
	 public float number (float val) {
		 return val;
	 }
public static void main(String[] args) {
	MethodOverloading obj = new MethodOverloading();
	 
	System.out.println(obj.number("Logesh"));
	
	int B = obj.number(15);
	System.out.println(B);
	
	float A = obj.number(1.21f);
	System.out.println(A);
	
	
	//public void number(){
	
	// int a = 10; }
	
	 
}
}

