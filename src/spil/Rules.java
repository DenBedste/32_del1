package spil;

class Rules {
	public boolean winner;

	public void Rules(int eyes) {
		switch (eyes) {
		case (2):
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
