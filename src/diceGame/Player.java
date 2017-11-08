package diceGame;

public class Player {
	private String name;
	private TwoDice dice;

	public int getBalance() {
		return AccountBalance.balance;
	}

	public void setBalance(AccountBalance balance) {
		this.balance = balance;
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

	public Player (String name, TwoDice dice) {
		this.name = name;
		this.dice = dice;
	}

}
