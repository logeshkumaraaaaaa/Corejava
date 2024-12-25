package sample;

public class MultiThreading extends Thread {
	
	
	public void Run( )   {
		System.out.println("This is A block ");
		
	}
	
public	void b(){
		System.out.println("This is B block ");
	}

	public static void main(String[] args) {
		MultiThreading obj = new MultiThreading();
		
		
		//for
		obj.Run();
		obj.b();
		obj.start();
		obj.stop();
	}

}
