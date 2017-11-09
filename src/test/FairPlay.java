package test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import diceGame.Game;
import diceGame.Player;
import diceGame.TwoDice;



public class FairPlay {
	Game game;
	private static int whosTurn = 0;
	private static Player player1;
	private static Player player2;
	private static TwoDice dice = new TwoDice(1,1);
	@Before
	public void setUp() throws Exception {
		game=new Game();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int win1=0;
		int win2=0;
		game.createPlayers("Player one", "Player two", "account1", "account2");
		for(int i=0;i<10000;i++) {
			while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
				if (whosTurn == 0) {
					
					//			GUI.getUserButtonPressed("                                            Current turn: " + player1.getName(), "Roll");
					game.updateTurn(dice.roll(), player1);
					//					System.out.println(dice.getDiceTotal());
					//					System.out.println("Player 1 balance " + player1.getBalance());
				} else {
					
					//			GUI.getUserButtonPressed("                                            Current turn: " + player2.getName(), "Roll");
					game.updateTurn(dice.roll(), player2);
					//					System.out.println(dice.getDiceTotal());
					//					System.out.println("Player 2 balance " + player2.getBalance());
				}
			}

			if (player1.getBalance() > 3000) {
				//			GUI.showMessage(player1.getName() + " won");
				//			GUI.close();
				win1++;

			} else {
				//			GUI.showMessage(player2.getName() + " won");			
				//			GUI.close();
				win2++;
			}
			player1.setBalance(1000);
			player2.setBalance(1000);
		}
		System.out.println(""+win2);
		System.out.println(""+win1);
		int diff = win1 - win2;

		boolean expected = true;
		boolean actual = (Math.abs(diff) < 400);
		assertEquals(expected, actual);

	}
}
	
