package spil;

// make class Dice_spillere
public class DicePlayer {
	//	instance variables
	private String name;
	private int point;


	//	constructor have parameter of type string the name of the player
	DicePlayer(String name){
		this.name = name;
		// Initializing
		point = 0;
		
	}

	//	gave the player name
	public String getName(){
		return name;
	}

	//	return the value of point
	public int getPoint(){
		return point;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void increasePoint(int dpoint){
	   point += dpoint;
	}
	
}
