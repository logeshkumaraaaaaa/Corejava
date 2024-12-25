package sample;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a integer value");
	
	int EmpId = sc.nextInt();
	System.out.println("The Empid is : " +  EmpId);
	
	sc.nextLine();
	
	System.out.println("Enter emp name ");
	
	String empName = sc.nextLine();
	
	System.out.println("Employee name is : " + empName);
	
	

	
		
		
	}

}
