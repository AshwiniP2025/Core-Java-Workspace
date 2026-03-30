package Encapsulation;

public class PersonDetails {
	public static void main(String [] args) {
		Person p = new Person();
		p.setName("Ashwini");
		p.setAge(21);
		
		System.out.println("Name is:-" +p.getName());
		System.out.println("Age:-" +p.getAge());
	}
}
