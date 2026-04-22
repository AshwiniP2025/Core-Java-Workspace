package Constructor;

public class EmployeeClass {
	public int id;
	public String name;
	public double salary;
	
	 public EmployeeClass(int id, String name) {
		 this.id = id;
		 this.name = name;
	 }
	 
	 public EmployeeClass(int id, String name, double salary) {
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
	 }
	 
	 public void show1() {
		 System.out.println(id);
		 System.out.println(name);
	 }
	 public void show2() {
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(salary);
	 }
	 
	 public static void main(String[] args) {
		EmployeeClass emp1 = new EmployeeClass(11, "Ashish");
		EmployeeClass emp2 = new EmployeeClass(12, "Ashwini", 50000);
		
		emp1.show1();
		emp2.show2();
	}

}
