package sample;

public class Interface1 implements InterfaceMain {

	@Override
	public void sound() {
		System.out.println("Animal makes sound ");
	}

	@Override
	public void Music() {
		System.out.println("Music gives blis ");
	}
	

	@Override
	public void sleep() {
		System.out.println("Sleep ");
		
	}

public static void main (String[] args) {

	Interface1 obj = new Interface1();
	obj.sleep();
	obj.sound();
	obj.Music();
}
}
