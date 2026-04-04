package Abstraction;

public abstract class Animal {
	abstract void makeSound();
	
	void eat() {
		System.out.println("Animal is eating");
	}
}

public class Dog extends Animal{

	void makeSound() {
		System.out.println("Dog barks");
		
	}
}

public class Cat extends Animal{

	@Override
	void makeSound() {
		System.out.println("Cat meows");
	}
}


//main class
public class AnimalMain {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.makeSound();
		
		Cat c = new Cat();
		c.makeSound();
	}
}