package diceGame;

import diceGame.TwoDice;

public class Player {
	private String name;
	private TwoDice dice;
	
	public TwoDice getDice() {
		return dice;
	}

	public void setDice(TwoDice dice) {
		this.dice = dice;
	}

	private AccountBalance account;

	public int getBalance() {
		return account.balance;
	}
	
	public void setBalance(int balance) {
		account.setBalance(balance);
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

	public Player (String name, int one, int two, int balance) {
		this.name = name;
		AccountBalance account1 = new AccountBalance(balance);
		this.account = account1;
		TwoDice dice = new TwoDice(one, two);
		this.dice = dice;
	}

}
