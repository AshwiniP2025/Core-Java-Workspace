package Constructor;

import java.util.Scanner;

public class StudentClass {
	
	public String name ;
	public int rollno;
	public float marks;
	
	public StudentClass (String name, int rollno, float marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	public void display() {
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = s.next();
		
		System.out.println("Enter the rollno");
		int rollno = s.nextInt();
		
		System.out.println("Enter the marks");
		float marks = s.nextFloat();
		
		StudentClass std = new StudentClass(name, rollno, marks);
		
		std.display();
	}
}
