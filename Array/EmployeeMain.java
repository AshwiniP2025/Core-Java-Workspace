package Array;

public class EmployeeMain {
	public static void main(String [] args) {
		
		
		Employee emp1 = new Employee("Ashwini", "Manager", 21, "female", 9325782832L, "ashu@gmail.com", "Pune",2 , 40000, "Day");
		Employee emp2 = new Employee("Divya", "Developer", 21, "female", 9325782832L, "diu@gmail.com", "Jalgaon",1 , 30000, "Day");
		Employee emp3 = new Employee("Nandini", "Developer", 20, "female", 9325782832L, "nandu@gmail.com", "Chalisgaon",2 , 30000, "Night");
		Employee emp4 = new Employee("Roshan", "Manager", 20, "male", 9325782832L, "roshan@gmail.com", "Pachora",5 , 50000, "Night");
		Employee emp5 = new Employee("Nikhil", "Manager", 22, "male", 9325782832L, "nikhil@gmail.com", "Pune",6 , 70000, "Night");
        
		Employee emp[] = {emp1, emp2, emp3, emp4, emp5};
		
		System.out.println("1.Name of all Managers:");
		for(int i = 0; i < emp.length; i++) {
			if (emp[i].desg.equals("Manager")) {
				System.out.println(emp[i].name);
			  }
			}
		System.out.println("\n2.Contact details os all freshers:");
		for(int i = 0; i < emp.length; i++) {
		    if(emp[i].exp <= 1 ) {
			   emp[i].displayEmployeeDetails();
		  }
	    }
		System.out.println("\n3.Giving hike of 10% in salary to all employees with exp more than 5 yrs:");
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].exp > 5) {
				double oldSalary = emp[i].salary;
				emp[i].salary *= 1.10;
				System.out.println(emp[i].name+ " Old Salary: " + oldSalary + ", New Salary: " +emp[i].salary);
			}
          }
		System.out.println("\n4.Name and Address of employees working in night shift:");
		for(int i = 0;i < emp.length; i++) {
			if(emp[i].shift.equalsIgnoreCase("night")) {
				System.out.println(emp[i].name + " Address: " + emp[i].address);
			}
		}
		System.out.println("\n5.Remove employees with age above 55:");
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].age <= 55) {
				System.out.println(emp[i].name + "Age: " + emp[i].age);
			}
		}
}
}