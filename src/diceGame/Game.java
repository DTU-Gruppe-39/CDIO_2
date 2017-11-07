package diceGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

	public String printText (int field) throws IOException {
		String str = "";
		String file = "textFile.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));

		for (int i = 0; i > field; i++) {
			String currentLine = reader.readLine();
			str = currentLine;
		}
		reader.close();

		return str;
	}
}