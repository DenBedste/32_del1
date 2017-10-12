package DiceGame;

class Rules {
	public boolean winner;

	public void Rules(int eyes) {
		switch (eyes) {
		case (12):
			winner = true;
		break;
		}
	}

	public Rules() {
		winner = false;
		// TODO Auto-generated constructor stub
	}


}
