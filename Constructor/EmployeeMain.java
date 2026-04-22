package Constructor;

public class EmployeeMain {
	public static void main(String [] args) {
		
		Employee e1 = new Employee(" Ashwini " , 21 , 30000 , 9325287832L );
		e1.display();
		Employee e2 = new Employee();
		e2.display();
		
	}

}
