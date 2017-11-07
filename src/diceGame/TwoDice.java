package diceGame;

public class TwoDice {
	private int faceValue;
	private int faces = 12;
	
	public TwoDice() {
		roll();
	}
	// roll the die and return the value (1-6)
	public int roll() {
		double d1=(float)Math.random();     // [0 ; 1[
		double d2=d1*faces;                    // [0 ; 6[
		faceValue = (int)Math.ceil(d2);        // [1-6] integer
		return faceValue;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
}
