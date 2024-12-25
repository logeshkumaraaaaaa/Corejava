package sample;

import java.util.Scanner;

public class AdvancedFor {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Grade A, B, C ");
		String nextLine = scanner.nextLine();
		
		switch(nextLine){
		
		
		case "A":
			System.out.println("Excellent"); 
			break;
			
		case "B":
			System.out.println("Good ");
			break;
		case "C":
			System.out.println("Need improvement");
			break;
			
		
		
		}
		
	}
		 
		
			

	
}
