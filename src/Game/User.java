package Game;

import java.util.Scanner;

public class User {
	int players = 0;
	String name;

	public User(String navn) {
		this.name = name;
		Scanner indput_name = new Scanner(System.in);
		System.out.print("indtast navn:");
		name = indput_name.next();
		indput_name.close();
		players++;
	}
}
