package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import diceGame.TwoDice;

class J_U_TwoDice {

	@BeforeEach
	void setUp() throws Exception {
		TwoDice dice = new TwoDice();
		int[] eyecount = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; //Array der indeholder antallet af gange de forskellige summe forkommer.
		int numbrolls = 1000;
		for (int i = 1; i <= numbrolls; i++) { //For loop der looper det antal gange vi gerne vil kaste med terningerne.
			TwoDice.roll();
			int r1 = dice.getdie1();
			int r2 = dice.getdie2();
			int sum = r1 + r2;
	}}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		for (int i = 0; i < 11; i++);
		
		fail("Not yet implemented");
	}

}
//package test;
//
//import diceGame.TwoDice;
//
//public class TwoDiceRollTest {
//
//	public static void main(String[] args) {
//		TwoDice dice = new TwoDice();
//		int[] eyecount = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; //Array der indeholder antallet af gange de forskellige summe forkommer.
//		int numbrolls = 1000;
//		for (int i = 1; i <= numbrolls; i++) { //For loop der looper det antal gange vi gerne vil kaste med terningerne.
//			TwoDice.roll();
//			int r1 = dice.getdie1();
//			int r2 = dice.getdie2();
//			int sum = r1 + r2;
//
//			// 2 - 12
//			// 0 - c.length-1
//			eyecount[sum-2] += 1;
//
//		}
//
//		for (int i = 0; i < 11; i++) { //For loop der printer antallet af gange de forskellige summe forkommer.
//			System.out.println("The number of times the sum of the two dice rolled was " + (i + 2) + ": " + eyecount[i]);
//		}
//	}
//
//}