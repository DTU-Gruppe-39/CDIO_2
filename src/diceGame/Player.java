package diceGame;

import diceGame.TwoDice;

public class Player {
	private String name;
	private TwoDice dice;
	private AccountBalance account;
	
	public TwoDice getDice() {
		return dice;
	}

	public void setDice(TwoDice dice) {
		this.dice = dice;
	}

	public int getBalance() {
		return this.account.balance;
	}
	
	public void setBalance(int balance) {
		this.account.setBalance(balance);
	}

	public void setNewBalance(int balance) {
		account.newBalance(balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public static TwoDice createDice() {	
//		TwoDice dice = new TwoDice();
//		return dice;
//	}

	public Player (String name, String accName, int one, int two, int balance) {
		this.name = name;
		this.account = new AccountBalance(balance);
		TwoDice dice = new TwoDice(one, two);
		this.dice = dice;
	}
}
