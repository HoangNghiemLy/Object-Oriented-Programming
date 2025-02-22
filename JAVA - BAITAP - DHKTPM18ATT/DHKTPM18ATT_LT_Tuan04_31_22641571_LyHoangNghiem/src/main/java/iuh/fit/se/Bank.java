/*
 * @ (#)  Bank.java   2023-06    Aug 28, 2023
 *
 * Copyright (c) 2023  IUH. All rights reserved.
 * Ho Chi Minh City
 */

package iuh.fit.se;

import java.util.ArrayList;
import java.util.List;

/*
 * @description:
 * @author:  	 Hoang Nghiem Ly
 * @work at:	 IUH
 * @date:    	 Aug 28, 2023
 * @time:		 3:19:03 PM
 * @verison: 	 2023-06
 * @location:    Ho Chi Minh City
 */

public class Bank {
	private String name;
	private List<BankAccount> accounts;
	private int numberOfAccounts;

	public Bank() {
		this.name = "Unnamed Bank";
		this.accounts = new ArrayList<>();
		this.numberOfAccounts = 100;
	}

	public Bank(String name, int numberOfAccounts) {
		if (numberOfAccounts <= 0) {
			throw new IllegalArgumentException("Number of accounts must be greater than 0");
		} else {
			this.name = name;
			this.accounts = new ArrayList<>();
			this.numberOfAccounts = numberOfAccounts;
		}
	}

	public void addNew(String accountNumber, String accountName, double balance) {
		if (accounts.size() >= numberOfAccounts) {
			throw new IllegalArgumentException("Bank is full");
		} else {
			for (BankAccount account : accounts) {
				if (account.getAccountNumber().equals(accountNumber)) {
					throw new IllegalArgumentException("Account number already exits");
				}
			}
			BankAccount newAccount = new BankAccount(accountNumber, accountName, balance);
			accounts.add(newAccount);
		}
	}

	public BankAccount find(String accountNumber) {
		for (BankAccount account : accounts) {
			if (account.getAccountNumber().equals(accountNumber)) {
				return account;
			}
		}
		return null;
	}

	public double getTotalBalance() {
		double totalBalance = 0;
		for (BankAccount account : accounts) {
			totalBalance += account.getBalance();
		}
		return totalBalance;
	}

	public int getNumberOfAccounts() {
		return accounts.size();
	}

	public BankAccount[] getAccounts() {
		return accounts.toArray(new BankAccount[0]);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
