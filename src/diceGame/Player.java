package diceGame;

import diceGame.TwoDice;

public class Player {
	private String name;
	private TwoDice dice;

	public static int getBalance() {
		return AccountBalance.balance;
	}
	
	public static void setBalance(int balance) {
		AccountBalance.setBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static TwoDice createDice() {	
		TwoDice dice = new TwoDice();
		return dice;
	}

	public Player (String name, TwoDice dice, int balance) {
		this.name = name;
		this.dice = dice;
		setBalance(balance);
	}

}
