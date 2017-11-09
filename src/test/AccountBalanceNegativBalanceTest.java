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

}
