package Polymorphism;

public class AnimalMain {
	
	public static void main(String [] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		a.makeSound();
		d.makeSound();
		c.makeSound();
	}

}
