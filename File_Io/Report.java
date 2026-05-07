package File_Io;

import java.io.*;
import java.util.Scanner;

public class Report {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("D:\\info.txt");
		System.out.println("File Report....\n");
		System.out.println(f.isHidden());
		System.out.println(f.getPath());
		System.out.println(f.getName());
		System.out.println(f.getUsableSpace());
		//Memory size is pending.
		
		System.out.println("\nPrinting the contant of the file.....");
		FileReader re = new FileReader(f);
		Scanner sc = new Scanner(re);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		
		System.out.println("no of words....");
		int count = 0;
		for (int i = 0; i < f.length(); i++) {
			
		}
	}
}
