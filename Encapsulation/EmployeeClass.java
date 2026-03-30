package Encapsulation;

public class EmployeeClass {
	private String name;
	private  int id;
	private double salary;
	
	private static final double MIN_WAGE = 5000.0;
	
	public EmployeeClass(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setSalary(double salary) {
		if(salary >= MIN_WAGE) {
		this.salary = salary;
		}else {
			System.out.println("Salary cannot be less than " + MIN_WAGE + "Setting to minimum wage.");
			this.salary = salary;
		}
	}
	public void Display() {
		System.out.println("NAME:" +name + " ID:" + id + " SALARY:" + salary);
	}
}
