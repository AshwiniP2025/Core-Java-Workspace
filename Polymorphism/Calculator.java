//Create a class Calculator with Overloaded methods 'add'. Implement the method to add two integers, three integers, and two double values.
package Polymorphism;

public class Calculator {
	
	public int add(int a, int b) {
		return a+b;	
	}
	public int add(int a, int b, int c) {
		return a+b+c;	
	}
	public double add(double a, double b) {
		return a+b;
	}

public static void main(String [] args) {
	Calculator c = new Calculator();
	System.out.println(c.add(5, 10));
	System.out.println(c.add(5, 10, 5));
	System.out.println(c.add(2.2, 10.5));

}
}