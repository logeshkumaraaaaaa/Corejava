package exception;

public class ArryboundException {
public static void main(String[] args) {
	try {
		
		int[] arr = new int[7];
		
		arr[8]=200;
		
		
	} 
	
	catch (Exception  e) {
		System.out.println("Please enter the value within the Index");
		e.printStackTrace();
	}
	
	finally {
		System.out.println("This block is always excute");
	}
	
	
	
}
}
