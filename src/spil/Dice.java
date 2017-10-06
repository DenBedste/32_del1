package spil;

public class terning {
 
 //	default constructer
	public Terninger() {
		roll();
 }
 
  //konstruktør
public terning(int diceValue) {
  }
 public int kast() {
  float d1=(float)Math.random();
  float d2=d1*5;
  int d3 = Math.round(d2);
  return d3 + 1;
 }
 public int 
}
