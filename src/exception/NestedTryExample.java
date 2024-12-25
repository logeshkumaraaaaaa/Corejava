package exception;

public class NestedTryExample {
	
	    public static void main(String[] args) {
	        try {
	            // Outer try block
	            int outerResult = 10 / 2;  // No exception here
	            System.out.println("Outer result: " + outerResult);
	            
	            try {
	                // Inner try block
	                int innerResult = 10 / 0;  // This will throw ArithmeticException
	                System.out.println("Inner result: " + innerResult);
	            } catch (ArithmeticException e) {
	                // Catch exception from the inner try block
	                System.out.println("Error in inner try block: Division by zero.");
	            }
	        } catch (Exception e) {
	            // Catch exception from the outer try block
	            System.out.println("Error in outer try block.");
	        }
	        
	        System.out.println("Program continues...");
	    }
	}


