package sample;


public  class StaticKey {
	
	static int id;
	
	 public  final void employee() {
		 int ab;
		  id=10;
		  System.out.println("The employee id is : " + (id=20));
	}
	 
	 private void teacher() {
		
		System.out.println("The teacher id is : " + (id=15));
	}
	
	 final private  void  student() {
		id=25;
		System.out.println("The student id is : " + (id=15));
		
		
	}
	 
	
	
	public static void main(String[] args) {
		StaticKey obj = new StaticKey();
		
		obj.employee();
		obj.student();
		obj.teacher();
		
		
		
		System.out.println("Demo");
		
		
		
		  try {
		  
		  
		  int a = 10;
		  
		  int b = 11;
		  
		  int c = a/b;
		  
		  System.out.println(c);
		  
		  }
		  
		  
		  catch(Exception e){
		  
		  e.printStackTrace();
		  
		  System.out.println(e);
		  
		  }
		  
		  finally {
			  System.out.println("This will always run finally");
			  
		  }
		 
		
		
		  
		  
	
		  
		  int ab = 16; 
		  
		  System.out.println(ab);
		 
		
		
		 

	}

}