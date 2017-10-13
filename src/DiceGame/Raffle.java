package DiceGame;

public class Raffle {
	private boolean r, r6;
	Dice t1 = new Dice();
	Dice t2 = new Dice();
	int[] raffle = new int[2];

	public int[] raffle() {
		raffle[0] = t1.roll();
		raffle[1] = t2.roll();
		if (raffle[0] == 6 && raffle[1] == 6) {
			r6 = true;
			r = true;
		} else if (raffle[0] == raffle[1])
			r = true;
		else
			;

		return raffle;
	}

	private void setEyes(int r1, int r2) {
		this.r = r;
		this.r6 = r6;
	}

}
