package DiceGame;
public class Dice {
 public int Roll() {
	int d1 = (int) (Math.random()*6) + 1;
	return d1;
 }
	/*public int rollMultiple(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = roll();
		}
		return result;
	}*/
}
	

