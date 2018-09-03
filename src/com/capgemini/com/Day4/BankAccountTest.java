package com.capgemini.com.Day4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
class BankAccountTest {
	
	BankAccount account1;
	BankAccount account2;
	BankAccount account3;
	BankAccount account4;
	BankAccount account5;
	
	
	@BeforeEach
	void setUp() {
		account1 = new BankAccount("John Doe", "SAVING", 50000);
		account2 = new BankAccount("Tom","CURRENT",45000);
		account3 = new SavingBankAccount("Ema",40000,true);
		account4 = new CurrentBankAccount("Elli",30000,10000);
		account5 = new SavingBankAccount("Rose",25000,false);
}

	@Test
	void testWithdraw() {
		assertEquals(45000.0, account1.withdraw(5000), 0.02);
		assertEquals(10000, account1.withdraw(35000), 0.02);
		assertEquals(10000, account1.withdraw(15000), 0.02);
		assertEquals(25000, account3.withdraw(15000), 0.02);
		assertEquals(5000, account3.withdraw(20000), 0.02);
		assertEquals(10000, account5.withdraw(15000), 0.02);
		assertEquals(10000, account5.withdraw(300), 0.02);
		assertEquals(15000, account4.withdraw(15000), 0.02);
		assertEquals(0, account4.withdraw(24000), 0.02);
		assertEquals(0, account4.withdraw(1500), 0.02);
		assertEquals(30000, account2.withdraw(15000), 0.02);
		assertEquals(30000, account2.withdraw(40000), 0.02);	
    
	}
	

	@Test
	void testDeposit() {
		assertEquals(55000.0, account1.deposit(5000), 0.02);
		assertEquals(15000, account4.withdraw(15000), 0.02);
		assertEquals(0, account4.withdraw(24000), 0.02);
		assertEquals(0, account4.deposit(5000), 0.02);
		assertEquals(1000, account4.deposit(5000), 0.02);
	}
	
	@Test
	void testTotalBankAccounts() {
		assertEquals(5, BankAccount.totalBankAccounts());
		}

	@AfterEach
	void tearDown() {
		account1 = null;
		account2 = null;
		account3 = null;
		account4 = null;
		account5= null;
	}
	
}