package DiceGame;

import java.util.Scanner;

class User {
	private String name;
	public static int score, players = 0;

	public User(String name) {
		if (players < 2) {
			this.name = name;
			score = 0;
			players++;
			System.out.println("Name: " + name + " set for player" + players);

		} else
			System.out.println("Max 2 players per game!");

	}
}
