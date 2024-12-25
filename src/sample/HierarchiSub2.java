package sample;

public class HierarchiSub2 extends HierarchiBase{

	public void Statename() {
		String State = "TamilNadu";
		System.out.println("State is " + State);

	}
	
	
	
	public static void main(String[] args) {
		
		HierarchiSub2 abc = new HierarchiSub2();
		
		//Sub1
		abc.CountryDetails();
		abc.Statename();
		//SUB2
		
		
	}
	
	
}
