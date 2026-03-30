package Encapsulation;

import java.util.Scanner;

public class StudentClass {
	
	private String name;
	private int rollno;
	private float marks;
	
	public StudentClass(String name, int rollno, float marks) {
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public float getMarks() {
		return marks;
	}
	
	public void display() {
		System.out.println(getName());
		System.out.println(getRollno());
		System.out.println(getMarks());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name = sc.next();
		
		System.out.println("Enter the rollno");
		int rollno = sc.nextInt();
		
		System.out.println("Enter the marks");
		float marks = sc.nextFloat();
		
		StudentClass std = new StudentClass( name, rollno, marks);
		
		std.display();
		
	}

}
