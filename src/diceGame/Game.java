package diceGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Game {

	public void updateBalance (int field) {

		switch (field) {
		case 1: 
			break;
		case 2: AccountBalance.updateBalance(250);
		break;
		case 3: AccountBalance.updateBalance(-100);
		break;
		case 4: AccountBalance.updateBalance(100);
		break;
		case 5: AccountBalance.updateBalance(-20);
		break;
		case 6: AccountBalance.updateBalance(180);
		break;
		case 7: AccountBalance.updateBalance(0);
		break;
		case 8: AccountBalance.updateBalance(-70);
		break;
		case 9: AccountBalance.updateBalance(60);
		break;
		case 10: AccountBalance.updateBalance(-80); //And extra turn
		break;   
		case 11: AccountBalance.updateBalance(-50);
		break;
		case 12: AccountBalance.updateBalance(650);
		break;
		}
	}

	public static void printText (int field) throws IOException {
		String str = "";
		String file = "src/textFile.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));

		for (int i = 0; i < field; i++) {
			String currentLine = reader.readLine();
			str = currentLine;
		}
		reader.close();
		System.out.println(str);
	}
}