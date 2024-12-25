package sample;

public class Nonparameterized {
	String studentName;
	int StudentId;
	

	Nonparameterized(){
	
		
		StudentId=12;
		studentName="Logesh";
		
		System.out.println("StudentID: " + StudentId);
		System.out.println("Student Name : " + studentName);
		
	}
	
	public static void main(String [] args) {
		Nonparameterized obj = new Nonparameterized();
		
	}
}
