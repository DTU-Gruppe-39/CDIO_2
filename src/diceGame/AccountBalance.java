package diceGame;

public class AccountBalance {
	public int balance;

	public AccountBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (this.balance + balance < 0) {
			this.balance = 0;
		} else {
		this.balance += balance;
		}
	}
	
//	public static void updateBalance(Player name, int gold) {
//		name.balance += gold;
//	}



}
