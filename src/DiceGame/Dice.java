package DiceGame;

public class Dice {
	public int Dice() {
		int d1 = (int) (Math.random() * 6) + 1;
		return d1;
	}

	public int roll() {
		int result = 0;

		result = Dice();

		return result;
	}
}
