/*
 * @ (#)  BankAccountTest.java   2023-06    Aug 30, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 30, 2023
 * @time:		 12:28:24 AM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

class BankAccountTest {

	private BankAccount account;
	@Before
	public void setUp() {
		account = new BankAccount("1234-5678-9012", "John Doe", 1000.0);
	}
	@Test
	public void testDeposit() {
		account.deposit(500.0);
		assertEquals(1500.0, account.getBalance(),0.01);
	}
	@Test
	public void testWithdrawInsufficientFunds() {
		account.withdraw(1500.0);
		assertEquals(1000.0, account.getBalance(),0.01);
	}
	@Test
	public void testTransferSufficientFunds() {
		BankAccount recipient = new BankAccount("5678-9012-3456", "Tran Hao Nam", 500.0);
		account.transfer(recipient, 300.0);
		assertEquals(700.0, account.getBalance(),0.01);
		assertEquals(800.0, recipient.getBalance(),0.01);
	}
	@Test
	public void testTransferInsufficientFunds() {
		BankAccount recipient = new BankAccount("3456-7890-1234", "Lo Van A", 500.0);
		account.transfer(recipient, 1500.0);
		assertEquals(1000.0, account.getBalance(),0.01);
		assertEquals(500.0, recipient.getBalance(),0.01);
	}
	@Test
	public void testToString() {
		String expected = "Account Number: 1234-5678-9012\nOwner Name: John Doe\nBalance: 1000.0";
		assertEquals(expected, account.toString());
	}

}
