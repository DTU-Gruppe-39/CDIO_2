package diceGame;

public class AccountBalance {
	public int balance;

	public AccountBalance(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (AccountBalance.balance + balance < 0) {
			AccountBalance.balance = 0;
		} else {
		AccountBalance.balance += balance;
		}
	}
	
//	public static void updateBalance(Player name, int gold) {
//		name.balance += gold;
//	}



}
