package DiceGame;

class User {
	private String name;
	public static int score, players = 0;
	public boolean winner;
	public User(String name) {
		if (players < 2) {
			this.name = name;
			winner = false;
			score = 0;
			players++;
			System.out.println("Name: " + name + " set for player" + players);

		} else
			System.out.println("Max 2 players per game!");

	}
	public String getname() {
	return name;
	}
	public int getscore() {
		return score;
	}
	public boolean getwinner() {
		return winner;
	}
	
}
