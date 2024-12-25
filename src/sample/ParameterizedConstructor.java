package sample;

public class ParameterizedConstructor {
String name;
int id ;

public ParameterizedConstructor(String Name,int ID){
	
	name=Name;
	id=ID;
	
	System.out.println("The id is : " +  id);
	System.out.println("The name is : " + name);
}
	public static void main (String[] args) {
		
		ParameterizedConstructor obj = new ParameterizedConstructor("Logesh",12);
		
		/*
		 * obj.id=12; obj.name="klk";
		 */
		
		
	}
}

  