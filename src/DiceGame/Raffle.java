package DiceGame;

public class Raffle {
	private int r1, r2;
	Dice t1 = new Dice();
	Dice t2 = new Dice();

	public int raffle() {
		r1 = t1.roll();
		r2 = t2.roll();

	return (r1+r2);
	}

	

}
