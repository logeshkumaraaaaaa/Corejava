package sample;

public class Animal {
	
	public String name;

	Animal(){
		System.out.println("Animal connstructor");
		
	}
	
	void display() {
		System.out.println("This an animal");
	}
	
	

}


 class Dog extends Animal{
	 
	 
	 String name = " Dog";
	 
	 
	 Dog(){
		 super();
		 System.out.println("Dog constructor");
	 }
	 
	 void printname() {
		 System.out.println("child class" + name);
		 
		 System.out.println("parent class name " + super.name);
		 
		 
	 }
	 
	 
	 void display() {
		 super.display();
		 System.out.println("This is dog");
	 }
	 

		 
	 public static void main(String[] args) {
		 Dog dg = new Dog();
		 dg.display();
		 dg.printname();
		
	}
	 
	 }
	
