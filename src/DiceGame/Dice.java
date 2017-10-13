package DiceGame;

public class Dice {

	private int d1;
	public int Dice() {
		this.d1 = (int) (Math.random() * 6) + 1;
		return d1;
	}

	public int roll() {
		int result = 0;

		result = Dice();

		return result;
	}
}
