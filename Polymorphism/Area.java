//Design a class 'Area' with overloaded method to calculate the area of a circle, rectangle, and triangle. 

package Polymorphism;

public class Area {
	public double CalculateArea(double radius) {
		return Math.PI*radius*radius;
	}
	public double CalculateArea(double length, double breadth) {
		return length*breadth;
	}
	public double CalculateArea(double base, double height, double unused) {
		return 0.5*base*height;
	}
	
	public static void main(String [] args) {
	Area a = new Area();
	System.out.println("Area of Circle: " +a.CalculateArea(5.0));
	System.out.println("Area of Rectagle: " +a.CalculateArea(4.0, 6,0));
	System.out.print("Area of Triangle: " +a.CalculateArea(4.0, 6.0, 0.0));
	
	}
}
