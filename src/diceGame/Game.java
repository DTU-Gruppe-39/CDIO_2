package diceGame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import desktop_resources.GUI;
import gui.Test;

public class Game {

	public static void main(String[] args) {
		Test.GUILauncher();
//		while (Player one.balance < 3000 && Player two.balance < 3000) {
//			Player one rolls
//			Update Gui
//			Update player ones balance
//			
//			Player two roles
//			Update Gui
//			Update player twos balance
//		}
//		
//		if (Player one.balance > 3000) {
//			System.out.println("Player two won");
//		} else {
//			System.out.println("Player one won");			
//		}
				
		
		
		
		
		
		
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
		GUI.showMessage(str);
	}


public void updateBalance (int field) {

	switch (field) {
	case 1: 
		break;
	case 2: Player.setBalance(250);
	break;  
	case 3: Player.setBalance(-100);
	break;   
	case 4: Player.setBalance(100);
	break;   
	case 5: Player.setBalance(-20);
	break;   
	case 6: Player.setBalance(180);
	break;   
	case 7: Player.setBalance(0);
	break;   
	case 8: Player.setBalance(-70);
	break;   
	case 9: Player.setBalance(60);
	break;
	case 10: Player.setBalance(-80); //And extra turn
	break;   
	case 11: Player.setBalance(-50);
	break;
	case 12: Player.setBalance(650);
	break;
	}
}

public void updateTurn (int field, Player name) {
	updateBalance(field);
	updateGUI(field, name);
}

public void updateGUI (int field, Player name) {
	GUI.setCar(field, name.getName());
	
	GUI.displayChanceCard();
	//Print text to GUI
	try {
		printText(field);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
