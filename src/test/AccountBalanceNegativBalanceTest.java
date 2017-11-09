package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import diceGame.AccountBalance;

public class AccountBalanceNegativBalanceTest {
	AccountBalance ac;
	@Before
	public void setUp() throws Exception {
		ac=new AccountBalance(1000);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		ac.setBalance(-2000);
		int Expected = 0;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}

	@Test
	public void test2() {
		ac.setBalance(-200);
		int Expected = 800;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test3() {
		ac.setBalance(-1000);
		int Expected = 0;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test4() {
		ac.setBalance(1000);
		int Expected = 2000;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test5() {
		ac.setBalance(-0);
		int Expected = 1000;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test6() {
		ac.setBalance(Integer.MIN_VALUE);
		int Expected = 0;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	@Test
	public void test7() {
		ac.setBalance(-1000);
		ac.setBalance(Integer.MAX_VALUE);
		int Expected = Integer.MAX_VALUE;
		int Actual = ac.getBalance();
		Assert.assertEquals(Expected,Actual);
	}
	
	
}
