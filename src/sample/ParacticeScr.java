package sample;
import java.util.Scanner;


public class ParacticeScr {

	public static void main (String [] args) {
		
		Scanner C = new Scanner(System.in);
		
		System.out.println("Enter age");
		
		
		int	a =	C.nextInt();
		
		System.out.println("Entre ID");
		int   id = C.nextInt();
		
		
		C.nextLine();
		
		
		System.out.println("Entre Name");
		
		String  Name = 	C.nextLine();
	
		
		
		
		
		
		
		System.out.println("The age is : " + a);
		System.out.println("The id : " + id);
		System.out.println("The name is : " + Name ) ;
		
		
		
		C.close();
		
	}

	
}
