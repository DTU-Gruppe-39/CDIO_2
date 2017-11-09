package diceGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import desktop_resources.GUI;
import diceGame.TwoDice;
import diceGame.Player;
import gui.GUIClass;


public class Game {
	private static Player player1;
	private static Player player2;
	private static TwoDice dice = new TwoDice(1,1);

	public static void createPlayers(String PlayerOneName, String PlayerTwoName, String account1, String account2) {
		player1 = new Player(PlayerOneName, account1, 1, 1, 1000);
		player2 = new Player(PlayerTwoName, account2, 1, 1 , 1000);
	}
	
	private static int whosTurn = 0;

	public static void main(String[] args) {
//		GUIClass.GUILauncher();
//		TwoDice(1, 1);
		Game.createPlayers("Player one", "Player two", "account1", "account2");
		while (player1.getBalance() < 3000 && player2.getBalance() < 3000) {
		if (whosTurn == 0) {
			Game Turn = new Game();
//			GUI.getUserButtonPressed("                                            Current turn: " + player1.getName(), "Roll");
			Turn.updateTurn(dice.roll(), player1);
			System.out.println(dice.getDiceTotal());
			System.out.println("Player 1 balance " + player1.getBalance());
		} else {
			Game Turn = new Game();
//			GUI.getUserButtonPressed("                                            Current turn: " + player2.getName(), "Roll");
			Turn.updateTurn(dice.roll(), player2);
			System.out.println(dice.getDiceTotal());
			System.out.println("Player 2 balance " + player2.getBalance());
		}
		}
		
		
		
//			Player one rolls
//			Update Gui
//			Update player ones balance
//			
//			Player two roles
//			Update Gui
//			Update player twos balance
//		
		if (player1.getBalance() > 3000) {
//			GUI.showMessage(player1.getName() + " won");
//			GUI.close();
		} else {
//			GUI.showMessage(player2.getName() + " won");			
//			GUI.close();
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
	


	
	//private static void TwoDice(int i, int j) {
		// TODO Auto-generated method stub
		
	//}




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
	case 2: name.setNewBalance(250);
	break;  
	case 3: name.setNewBalance(-100);
	break;  
	case 4: name.setNewBalance(100);
	break;  
	case 5: name.setNewBalance(-20);
	break;  
	case 6: name.setNewBalance(180);
	break;  
	case 7: name.setNewBalance(0);
	break;  
	case 8: name.setNewBalance(-70);
	break;  
	case 9: name.setNewBalance(60);
	break;
	case 10: name.setNewBalance(-80); //And extra turn
	break;   
	case 11: name.setNewBalance(-50);
	break;
	case 12: name.setNewBalance(650);
	break;
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
//	GUI.removeAllCars(player.getName());
//	GUI.setCar(field, player.getName());
//	GUI.setBalance(player.getName(), player.getBalance());
//	GUI.setDice(dice.getdie1(), dice.getdie2());
//	//Print text to GUI
//	try {
//		printText(field);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
}


}
