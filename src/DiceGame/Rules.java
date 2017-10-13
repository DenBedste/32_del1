package DiceGame;

public class Rules {
	public boolean winner;

	public void CheckRules(int[] eyes) {
		switch (eyes[0] + eyes[1]) {

		case (2):
			winner = true;
			break;

		case (4):
			winner = true;
			break;
		case (3):
			winner = true;
			break;
		case (12):
			winner = true;
			break;
		}
	}

	public Rules() {
		winner = false;
	}

}
