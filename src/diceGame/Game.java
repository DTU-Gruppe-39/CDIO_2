package diceGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Game {

	public static void main(String[] args) {
		
		while (Player one.balance >= 0 && Player two.balance >= 0) {
			Player one rolls
			Update Gui
			Update player ones balance
			
			Player two roles
			Update Gui
			Update player twos balance
		}
		
		if (Player one.balance < 0) {
			System.out.println("Player two won");
		} else {
			System.out.println("Player one won");			
		}
		
		
		
		
		
		
		
		
		
		Player one = new Player("Peter", Player.createDice());
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		TwoDice dice;	//Test of TwoDice in Main.

		dice = new TwoDice();  //Slettes

		TwoDice.roll();
		System.out.println("The dice come up " + dice.getdie1() 
		+ " and " + dice.getdie2());
		System.out.println("The total is: " + dice.getDiceTotal());
		
		//Print string connected to specific field	
		try {
			Game.printText(dice.getDiceTotal());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


	
	//Read from textFile
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


public void updateField (int field) {

	switch (field) {
	case 1: 
		break;
	case 2: AccountBalance.setBalance(250);
	break;                 
	case 3: AccountBalance.setBalance(-100);
	break;                 
	case 4: AccountBalance.setBalance(100);
	break;                 
	case 5: AccountBalance.setBalance(-20);
	break;                 
	case 6: AccountBalance.setBalance(180);
	break;                 
	case 7: AccountBalance.setBalance(0);
	break;                 
	case 8: AccountBalance.setBalance(-70);
	break;                 
	case 9: AccountBalance.setBalance(60);
	break;
	case 10: AccountBalance.setBalance(-80); //And extra turn
	break;   
	case 11: AccountBalance.setBalance(-50);
	break;
	case 12: AccountBalance.setBalance(650);
	break;
	}
}
}
