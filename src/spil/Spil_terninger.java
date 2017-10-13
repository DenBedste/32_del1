package spil;

import java.util.Scanner;

public class Spil_terninger {

	public static void main(String[] arg) {
		// Locale variables
		Terninger dices1 = new Terninger();
		Terninger dices2 = new Terninger();
		DicePlayer player1, player2;

		System.out.println("Welcome to the dice game \n");

		// Locale variable
		String name;

		// Make an instance of keyboard Scanner
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the first playername");

		// Read string name
		name = keyboard.nextLine();

		// Make an new instance of Dice_spillere for the first player
		player1 = new DicePlayer(name);
		System.out.println();
		System.out.println("Enter the second playername");

		name = keyboard.nextLine();

		// Make an new instance of Dice_spillere for the second player
		player2 = new DicePlayer(name);
		// make int variable to hold the number of dice
		int rolls = 0;

		while (true) {
			// print the first player name
			System.out.println();
			System.out.println(player1.getName());
			System.out.println("How many times do you want to roll the dice \n");
			// making while-loop to allow the player to give only a positive number
			while (true) {
				if (keyboard.hasNextInt()) {
					rolls = keyboard.nextInt();
					if (rolls <= 0) {
						System.out.println("It should be a positive number");
						System.out.println("Try again \n");
					} else
						break;
				} else {
					System.out.println("Enter numbers only.");
					keyboard.next();
				}
			}
			// The player who gets 40 points wins
			// call the method rollDice and allow the player to roll the dice
			dices1.rollMultiple(rolls);
			player1.increasePoint(dices1.getSum());
			System.out.printf("you got %d and %d which equals %d", dices1.getDiceface1(), dices1.getDiceface2(),
					dices1.getSum());
			System.out.printf("your new account is %d\n ", player1.getPoint());

			// if point is >= 40 then the player wins and the game stops.
			if (player1.getPoint() >= 40) {
				System.out.println("congratulations " + player1.getName() + " you are the winner");
				// finish with the first while
				break;
			}
			// do the same for the second player
			System.out.println();
			System.out.println(player2.getName());
			System.out.println("How many times do you want to roll the dice \n");

			while (true) {
				if (keyboard.hasNextInt()) {
					rolls = keyboard.nextInt();
					if (rolls <= 0) {
						System.out.println("It should be a positive number");
						System.out.println("Try again \n");
					} else
						break;
				} else {
					System.out.println("Enter numbers only.");
					keyboard.next();
				}
			}

			dices2.rollMultiple(rolls);
			player2.increasePoint(dices2.getSum());
			System.out.printf("you got %d and %d which equals %d", dices2.getDiceface1(), dices2.getDiceface2(),
					dices2.getSum());
			System.out.printf("your new account is %d\n ", player2.getPoint());

			if (player2.getPoint() >= 40) {
				System.out.println("congratulations " + player2.getName() + " you are the winner ");
				break;
			}
		}
		// Close the scanner
		keyboard.close();
	}
}