package sample;

public class HierarchiSub1 extends HierarchiBase {
	
	public void Ourcountryname() {
		String country = "Indiaaa";
		System.out.println("Our country is : " + country);
		
		boolean a = country == "India";
		System.out.println(a);
		
		int type = 10;
		long l = type;
		
		
		
		
		System.out.println("Long value is " + l);

		double db = 1.2577777;
		
		int f = (int) db;// Narrowing;
		System.out.println(f);

		
		
	}
	
	public static void main(String[] args) {
		HierarchiSub1 ABC = new HierarchiSub1();
		ABC.Ourcountryname();
		ABC.CountryDetails();
	}
	
}
