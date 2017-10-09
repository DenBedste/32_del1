package spil;
public class Terning {
 private int roll() {
	int d1 = (int) (math.random()*6) + 1;
	
	public int rollMultiple(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = roll();
		}
		return result;
	}
}
	

