package Constructor;

import java.util.Scanner;

public class FriendMain {
	public static void main(String [] args) {
		
		Friend f1 = new Friend("Divya ", "diuu ", "School friend ", 21 , "Pachora ", 1111122222L);
		Friend f2 = new Friend("Lavanya ", "Tau ", "School friend ", 21 , "Kalyan ", 2222233333L);
		Friend f3 = new Friend("Sakshi ", "sakshu ", "collage friend ", 21 , "Jalgaon ", 3333344444L);
		Friend f4 = new Friend("Nandini ", "Nandu ", "collage friend ", 21 , "Chalisgaon ", 4444455555L);
		
		Scanner sc = new Scanner (System.in);
		Friend f = new Friend ();
		
		System.out.println("Enter the details:");
		System.out.println("Name: ");
		f.setName(sc.nextLine());
		
		System.out.println("Nickname: ");
		f.setNickname(sc.nextLine());
		
		System.out.println("Type: ");
		f.setType(sc.next());
		
		System.out.println("Age: ");
		f.setAge(sc.nextInt());
		
		System.out.println("Address: ");
		f.setAddress(sc.nextLine());
		
		sc.nextLine();
		
		System.out.println("Phone: ");
		f.setPhone(sc.nextLong());
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f);
	}
}
