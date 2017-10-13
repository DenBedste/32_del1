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
	private void setEyes(int r1, int r2) {
		this.r1=r1;
		this.r2=r2;
	}

	

}
