package gui;
import java.awt.Color;

import desktop_codebehind.Car;
import desktop_fields.Field;
import desktop_fields.Shipping;
import desktop_resources.GUI;
import diceGame.Game;
public class Test {
//Test
	public static void GUILauncher() {
	Field [] fields = new Field [12];
//	GUI.create(fields);
	
	fields[0] = new Shipping.Builder()
			.setTitle("START")
			.setSubText("START")
			.setDescription("Game starts here")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[1] = new Shipping.Builder()
			.setTitle("Tower")
			.setSubText("+200 gold")
			.setDescription("The Tower")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[2] = new Shipping.Builder()
			.setTitle("Crater")
			.setSubText("-100 gold")
			.setDescription("The Crater")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[3] = new Shipping.Builder()
			.setTitle("Palace Gates")
			.setSubText("+100 gold")
			.setDescription("The Royal Palace Gates")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[4] = new Shipping.Builder()
			.setTitle("Cold Desert")
			.setSubText("-20 gold")
			.setDescription("The Cold Desert")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[5] = new Shipping.Builder()
			.setTitle("Walled City")
			.setSubText("+180 gold")
			.setDescription("The Walled City")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[6] = new Shipping.Builder()
			.setTitle("Monastary")
			.setSubText("Nothing happens.")
			.setDescription("The Monastary")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[7] = new Shipping.Builder()
			.setTitle("Black Cave")
			.setSubText("-70 gold")
			.setDescription("The Black Cave")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[8] = new Shipping.Builder()
			.setTitle("Huts")
			.setSubText("+60 gold")
			.setDescription("Huts in the mountainside")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[9] = new Shipping.Builder()
			.setTitle("The Werewall")
			.setSubText("-80 gold, take an ekstra turn!")
			.setDescription("The Werewall")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[10] = new Shipping.Builder()
			.setTitle("The Pit")
			.setSubText("-50 gold")
			.setDescription("The Pit")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	
	fields[11] = new Shipping.Builder()
			.setTitle("Goldmine")
			.setSubText("+650 gold")
			.setDescription("The Goldmine")
			.setBgColor(Color.white)
			.setPicture("lul.png")
			.build();
	

	
	
	Car one = new Car.Builder()
		.typeUfo()
		.primaryColor(Color.RED)
		.build();
	
	Car two = new Car.Builder()
			.typeRacecar()
			.primaryColor(Color.BLUE)
			.build();
	
	GUI.create(fields);
	String playerOneName = GUI.getUserString("Player one enter name");
	String playerTwoName = GUI.getUserString("Player two enter name");
	GUI.addPlayer(playerOneName, 1000, one);
	GUI.addPlayer(playerTwoName, 1000, two);
	GUI.setCar(1, playerOneName);
	GUI.setCar(1, playerTwoName);

	Game.createPlayers(playerOneName, playerTwoName, "account1", "account2");
	
	
	
	
	
	
	}
}