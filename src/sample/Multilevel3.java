package sample;

public class Multilevel3 extends Multilevel2 {
	
	private void studentAddress() {
		String address = "3/74, coimbatore, tamilnadu";
		System.out.println("The address is : " +address);

	}
	
	public static void main(String[] args) {
		Multilevel3 obj = new Multilevel3();
		obj.StudentDetails();
		obj.studentID();
		obj.studentdept();
		obj.studentAddress();
	}

}
