package Abstraction;

import java.util.Scanner;

public class MediaPlayerSystem {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		MediaPlayable player = null;
		
		System.out.println("Choose Media type: ");
		System.out.println("1. Audio");
		System.out.println("2. Video");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			player = new AudioPlayer();
		}else if (choice == 2) {
			player = new VideoPlayer();
		}else {
			System.out.println("Invalid choice!");
		}
		while (true) {
			System.out.println("\nSelect action:");
			System.out.println("1. Play");
			System.out.println("2. Pause");
			System.out.println("3. Stop");
			System.out.println("4. Exit");
			int action = sc.nextInt();
			
			switch(action) {
			case 1: player.play();break;
			case 2: player.pause();break;
			case 3: player.stop();break;
			case 4:
				System.out.println("Exiting media player...");
				
			}
		}
		
	}

}
