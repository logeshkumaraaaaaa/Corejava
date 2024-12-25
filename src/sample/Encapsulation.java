package sample;

public class Encapsulation {
	private int Id;
	

	
	public  int Getter(int Id) {
		return Id;
	}
	
	public void Setter(int a) {
		
		a=10;
		Id= a;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.Setter(12);
		
		System.out.println(obj.Id);
	}

		
	}


