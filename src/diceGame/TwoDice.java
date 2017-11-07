package diceGame;
import java.util.Random;

public class TwoDice {

	private static int die1;	//value of 1st die.
	private static int die2;	//value of 2nd die.

	public TwoDice() {
		roll();
	}
	public static void roll() {		//Rolls both dice to a value between 1 and 6.

		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;
	} 
	public int getdie1() {	//Returns value of die 1.
		return die1;
	}
	public int getdie2() {	//Returns value of die 2.
		return die2;
	}
	public int getDiceTotal() {	//Returns the values of the two dice added together.
		return die1 + die2;
	}
}