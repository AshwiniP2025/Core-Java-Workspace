package Array;

public class Employee {
	public String name, desg, gender, email, address, shift;
	public int age, exp;
	public long phone;  
	public double salary; 

public Employee(String name, String desg,  int age,  String gender, long phone, String email, String address, int exp, double salary,  String shift){
	this.name = name;
	this.desg = desg;
	this.age = age;
	this.gender = gender;
	this.phone = phone;
	this.email = email;
	this.address = address;
	this.exp = exp;
	this.salary = salary;
	this.shift = shift;
}	
	 public void displayEmployeeDetails () {
	        System.out.println("Name: " + name + ", Phone: " + phone + ", Email: " + email);
	    }


}