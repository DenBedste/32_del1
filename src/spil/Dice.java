package spil;

public class Terning {
 
	
 private int roll() {
	 float d1 = (float)Math.random();
	 float d2 = d1 * 5;
	 int d3 = Math.round(d2); 
	 return d3 + 1; 
	
	public int rollMultiple(int n) {
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = roll();
		}
		return result;
	}
}
	

