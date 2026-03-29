//Write a java program where a class 'Printer' has an overloaded method 'print' to print an integer, a double, and a string.

package Polymorphism;

public class Printer {
	
	public void print(int number) {
		System.out.println("Integer: " +number);
	}
	public void print(double number) {
		System.out.println("Double: " +number);
	}
	public void print(String text) {
		System.out.println("String: " +text);
	}
	
	
	public static void main(String [] args) {
		Printer myprinter = new Printer();
		myprinter.print(25);
		myprinter.print(2.5);
		myprinter.print("Good Morning");
	}

}
