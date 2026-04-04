package Abstraction;

public abstract class Shape {
	
	abstract double calculateArea();

}


//circle class
public class Circle extends Shape{
    double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	double calculateArea() {
		return Math.PI*radius*radius;	
	}
}


//rectangle class
public class Rectangle extends Shape{
	double length;
	double breadth;
	
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	double calculateArea() {
		return length * breadth;
	}
}


//main class
public class ShapeMain {
	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		Shape s2 = new Rectangle(4, 6);
		
		System.out.println("Circle Area:- " +s1.calculateArea());
		System.out.println("Rectangle Area:- " +s2.calculateArea());
	}
}

