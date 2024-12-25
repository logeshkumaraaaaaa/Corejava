package sample;

public class AbstractSub extends AbstractMain {
	

	@Override
	void Noise() {
	System.out.println("Logesh");
		
	}
	
	public static void main(String[] args) {
		
		AbstractSub obj = new AbstractSub();
		
		obj.sleep();
		obj.Noise();
	}
}
