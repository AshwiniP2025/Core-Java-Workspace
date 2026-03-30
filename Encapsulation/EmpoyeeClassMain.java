package Encapsulation;

public class EmpoyeeClassMain {
	public static void main(String[] args) {
		EmployeeClass emp1 = new EmployeeClass("Ashwini", 20, 50000);
		EmployeeClass emp2 = new EmployeeClass("Roshan", 25, 4000);
		
		emp1.Display();
		emp2.Display();
		
		emp2.setSalary(3000);
		
		emp2.Display();
		
		emp2.setSalary(8000);
		
		emp2.Display();
	}

}
