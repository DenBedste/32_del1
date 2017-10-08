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
	
	
