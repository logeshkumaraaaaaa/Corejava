package sample;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner  (System.in);
		
		System.out.println("Enter the day ");

		
		int day = scanner.nextInt();
		
		

				
		switch (day) {
		
		case 1 :
			System.out.println("Day 1 is Sunday");
			break;
		
			
		case 2 :
			System.out.println("Day 2 is Monday");
			break;
			
		case 3 :
			System.out.println("Day 3 is Tuesday");
			break;
		
		case 4 :
			System.out.println("Day 4 is Wednesday");
			break;
		
		case 5 :
			System.out.println("Day 5 is Thursday");
			break;
		
		case 6 :
			
			System.out.println("Day 6 is Friday");
			break;
		case 7 :
			System.out.println("Day 7 is Saturday");
			break;
		
		
			
			
			
		}
		
		
		
	 switch (4)  {
	case 4:
		
		System.out.println("This is 4");
		break;
		
	case 5:
		System.out.println("This is 5");
		break;
	
	}
		
	}

}
