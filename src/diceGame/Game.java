package diceGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import desktop_resources.GUI;
import diceGame.TwoDice;
import diceGame.Player;
import gui.Test;


public class Game {
	private static Player player1;
	private static Player player2;
	private static TwoDice dice = new TwoDice(1,1);

	public static void createPlayers(String PlayerOneName, String PlayerTwoName) {
		player1 = new Player(PlayerOneName, 1, 1, 1000);
		player2 = new Player(PlayerTwoName, 1, 1 , 1000);
	}
	
	private static int whosTurn = 0;

	public static void main(String[] args) {
		Test.GUILauncher();
//		while (Player one.balance < 3000 && Player two.balance < 3000) {
		
//		TwoDice(1, 1);

		if (whosTurn == 0) {
			Game Turn = new Game();
			
			Turn.updateTurn(dice.roll(), player1);
			
		} else {
			Game Turn = new Game();
			Turn.updateTurn(dice.roll(), player2);
		}
		
		
		
//			Player one rolls
//			Update Gui
//			Update player ones balance
//			
//			Player two roles
//			Update Gui
//			Update player twos balance
//		}
//		
		if (player1.getBalance() > 3000) {
			GUI.showMessage(player1.getName() + " won");
		} else {
			GUI.showMessage(player2.getName() + " won");			
		}
				
		
		
		
		//--------Skal nok slettes
		//Player one = new Player("Peter", Player.createDice(), 1000);
		

		
		
		
		
		
		
		
		
//		//Skal nok slettes
//		TwoDice dice;	//Test of TwoDice in Main.
//
//		dice = new TwoDice();  //Slettes
//
//		TwoDice.roll();
//		System.out.println("The dice come up " + dice.getdie1() 
//		+ " and " + dice.getdie2());
//		System.out.println("The total is: " + dice.getDiceTotal());
//		
//		//Print string connected to specific field	
//		try {
//			Game.printText(dice.getDiceTotal());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	


	
	private static void TwoDice(int i, int j) {
		// TODO Auto-generated method stub
		
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


public void updateBalance (int field, Player name) {

	//Skal helst have formen player1.setBalance
	//Så object.method()
	
	switch (field) {
	case 1: 
		break;
	case 2: name.setBalance(250);
	break;  
//	case 3: Player.setBalance(-100);
//	break;   
//	case 4: Player.setBalance(100);
//	break;   
//	case 5: Player.setBalance(-20);
//	break;   
//	case 6: Player.setBalance(180);
//	break;   
//	case 7: Player.setBalance(0);
//	break;   
//	case 8: Player.setBalance(-70);
//	break;   
//	case 9: Player.setBalance(60);
//	break;
//	case 10: Player.setBalance(-80); //And extra turn
//	break;   
//	case 11: Player.setBalance(-50);
//	break;
//	case 12: Player.setBalance(650);
//	break;
	}
}

public void updateTurn (int field, Player player) {
	updateBalance(field, player);
	updateGUI(field, player);
	
	if (field == 10) {
	
	}
	else if (whosTurn == 0) {
		whosTurn++;
	}
	else {
		whosTurn--;
	}
}


public void updateGUI (int field, Player player) {
	GUI.setCar(field, player.getName());
	GUI.setDice(dice.getdie1(), dice.getdie2());
	//Print text to GUI
	try {
		printText(field);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}
