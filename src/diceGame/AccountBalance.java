package diceGame;

public class AccountBalance {
	public static int balance;

	public AccountBalance(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (this.balance < balance) {
			this.balance = 0;
		} else {
		this.balance = balance;
		}
	}
	
//	public static void updateBalance(Player name, int gold) {
//		name.balance += gold;
//	}



}
