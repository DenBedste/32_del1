/**
 * 
 */
package DiceGame;

import java.util.Scanner;

/**
 * @author Stonecore
 *
 */
public class game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Name1, Name2;
		Scanner indput = new Scanner(System.in);
		Name1 = indput.next();
		Name2 = indput.next();
		User p1 = new User (Name1);
		User p2 = new User (Name2);
		indput.close();

	}

}
