package exception;


	public class NestedCatchExample {
	    public static void main(String[] args) {
	        try {
	            int[] arr = new int[5];
	            arr[10] = 50;  // This will throw ArrayIndexOutOfBoundsException
	            int result = 10 / 0;  // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: Division by zero.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: Array index is out of bounds.");
	        } catch (Exception e) {
	            System.out.println("General Exception caught.");
	        }

	        
	        finally {
	        	 System.out.println("Program continues after handling exception...");
	        }
	       
	    }
	}


