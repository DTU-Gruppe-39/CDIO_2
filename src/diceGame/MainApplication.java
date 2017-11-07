package diceGame;

import java.io.IOException;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDice dice;	//Test of TwoDice in Main.

		dice = new TwoDice();

		TwoDice.roll();
		System.out.println("The dice come up " + dice.getdie1() 
		+ " and " + dice.getdie2());
		System.out.println("The total is: " + dice.getDiceTotal());
		
		//Print string connected to specific field
		try {
			System.out.println(Game.printText(dice.getDiceTotal()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
