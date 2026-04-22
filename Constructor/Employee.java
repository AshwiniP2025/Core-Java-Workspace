//Create Employee class with a few variables in it. Define parameterized and non-parameterized constructor for the class. Create 1 object using each constructor and display the values.
package Constructor;

public class Employee {
	public String Name;
	public int age;
	public int salary;
	public long mobno;
	
	public Employee(String Name, int age, int salary, long mobno) {
		this.Name = Name;
		this.age = age;
		this.salary = salary;
		this.mobno = mobno;
	}
	
	public Employee() {
		Name = "Nandini";
		age = 20;
		salary = 20000;
		mobno = 2345678901L;
	}
	
	public void display() {
		System.out.println("empName:- " +Name);
		System.out.println("empAge:- " +age);
		System.out.println("empSalary:- " +salary);
		System.out.println("empMobNo:- " +mobno);
		System.out.println();
	}

}

