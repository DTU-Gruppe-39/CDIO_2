package diceGame;

public class TwoDice {

	private int die1; //value of 1st die.
	private int die2; //value of 2nd die.

	public TwoDice() {
		roll();
	}
	public void roll() {

		die1 = (int)(Math.random())*6 + 1;
		die2 = (int)(Math.random())*6 + 1;
	} 
	public int getdie1() {
		return die1;
	}
	public int getdie2() {
		return die2;
	}
	public int getDiceTotal() {
		return die1 + die2;
	}

}