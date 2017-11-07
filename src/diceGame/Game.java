package diceGame;

public class Game {
	
	public void updateBalance () {
	int sum = 1;

	switch (sum) {
	case 1: 
		break;
	case 2: Player.balance += 250;
		break;
	case 3: Player.balance += -100;
		break;
	case 4: Player.balance += 100;
		break;
	case 5: Player.balance += -20;
		break;
	case 6: Player.balance += 180;
		break;
	case 7: Player.balance += 0;
		break;
	case 8: Player.balance += -70;
		break;
	case 9: Player.balance += 60;
		break;
	case 10: Player.balance += -80; //And extra turn
		break;
	case 11: Player.balance += -50;
		break;
	case 12: Player.balance += 650;
		break;
	}
	
}
}