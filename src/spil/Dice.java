package spil;

import java.util.Math;

public class Dice {
  private int diceValue;
  private int d1;
  private int d2;
  private int d3;
 
  //konstruktør
public dice(diceValue) {
  }
 public int roll() {
  float d1=(float)Math.random(int n);
  float d2=d1*5;
  int d3=Math.round(d2);
  return d3 + 1;
 }
}
