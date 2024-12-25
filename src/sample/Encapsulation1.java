package sample;

public class Encapsulation1 {
	private int StudentID;
	private String Name;
		
	public  int get (int StudentID) {
		return StudentID;
	}
	
	public void Set(int StudentID) {
		
		this.StudentID = StudentID;
	}
	
	
	public String get1(String Name) {
		
		return Name;
	}
	
	
	public void set1(String Name) {
		
		this.Name = Name;
	}
	
	public static void main (String[] args) {
		Encapsulation1 obj = new Encapsulation1();
		obj.Set(10);
		obj.set1("Logesh");
		
		
		
		System.out.println(obj.StudentID);
		System.out.println(obj.Name);
	}
		
		
	}


