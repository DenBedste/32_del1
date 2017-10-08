public class Dice_spillere{

private String name;
private int point;
private Terninger d1,d2;
  
  Dice_spillere(String name){
this.name = name;
point = 0;
d1 = new Terninger();
d2 = new Terninger();
}
	
public String getName(){
return name;
	}
	
public int getPoint(){
return point;
	}
	
void rollDice(int n) {
int f1 = 0,f2 = 0;
	
f1 = d1.rollMultiple(n);
f2 = d2.rollMultiple(n);
	
point += f1 + f2;
	
System.out.printf(" you got %d and %d wich equals %d" ,f1, f2, f1+f2);
System.out.printf(" your new account is %d\n " , point);
}
	
	
