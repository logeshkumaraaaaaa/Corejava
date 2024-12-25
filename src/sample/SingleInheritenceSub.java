package sample;


public class SingleInheritenceSub extends SingeInheritenceMain {

	
	  public void EmployeeDepartment() {
		  
	  System.out.println("The employee department is : Mechatronics ");
		  
	  }
	  
	    
	public void EmpSalary() {
		float salary = 5500.0f;
		System.out.println(salary);
	}
	
	
	  public static void main(String[] args) {
	  
	 SingleInheritenceSub object = new SingleInheritenceSub();
	 object.EmployeeDepartment();
	 object.EmployeeID();
	 object.EmployeeName();
	 object.EmpSalary();
	// object.EmployeeSecretID();
	  
	  }
	 
}
