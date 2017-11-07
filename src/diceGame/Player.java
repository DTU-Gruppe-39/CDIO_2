package diceGame;

public class Player {
	private String name;
	private TwoDice dice;

	public static TwoDice createDice() {	
		TwoDice dice = new TwoDice();
		return dice;
	}

	public Player (String name, TwoDice dice) {
		this.name = name;
		this.dice = dice;
	}

}
