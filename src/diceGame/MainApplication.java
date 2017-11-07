package diceGame;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDice dice;

		dice = new TwoDice();


		TwoDice.roll();
		System.out.println("The dice come up " + dice.getdie1() 
		+ " and " + dice.getdie2());
		System.out.println("The total is: " + dice.getDiceTotal());
	}
}
