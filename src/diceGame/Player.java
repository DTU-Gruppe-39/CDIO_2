package diceGame;

import diceGame.TwoDice;

public class Player {
	private String name;
	private TwoDice dice;
	private AccountBalance account;

	public int getBalance() {
		return AccountBalance.balance;
	}
	
	public void setBalance(int balance) {
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
		//setBalance(balance);
		AccountBalance account1 = new AccountBalance(balance);
		this.account = account1;
	}

}
