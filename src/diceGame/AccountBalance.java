package diceGame;

public class AccountBalance {
	public static int balance;

	public AccountBalance(int balance) {
		super();
		AccountBalance.balance = balance;
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
