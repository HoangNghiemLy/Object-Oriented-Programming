/*
 * @ (#)  BankAccount.java   2023-06    Aug 28, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 28, 2023
 * @time:		 2:57:57 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String ownerName;
	
	//Constructors
	public BankAccount() {
		this.accountNumber = "0000-0000-0000";
		this.ownerName = "No name";
		this.balance = 0.0;
	}
	public BankAccount(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	//Deposit money (gửi tiền)
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited: "+amount);
		}else {
			System.out.println("Invalid deposit amount.");
		}
	}
	//Withdraw money (rút tiền)
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw: "+amount);
		}else {
			System.out.println("Invalid withdrawal amount.");
		}
	}
	// Get current balance
	public double getBalance() {
		return balance;
	}
	// Transfer money to another account
	public void transfer(BankAccount other, double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			other.deposit(amount);
			System.out.println("Transferred: "+amount+" to "+other.ownerName);
		}else {
			System.out.println("Invalid transfer amount.");
		}
	}
	// Setters and getters for accountNumber and ownerName
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	// Return account information
	@Override
	public String toString() {
		return "Account Number: "+accountNumber+"\nOwner Name: "+ownerName+"\nBalance: "+balance;
	}
}
