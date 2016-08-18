package com.brainacad.oop.testthread8;

public class Bank {
	private int accounts[];
	private int numOfAccounts;

	public Bank(int num_accounts, int init_balance) {
		accounts = new int[num_accounts];
		numOfAccounts = num_accounts;
		for (int i = 0; i < accounts.length; i++) {
			accounts[i] = init_balance;
		}
	}

	synchronized void transfer(int from, int to, int amount) {
		try {
			if (accounts[from] < amount)
				return;
			System.out.println("from: " + from + " to: " + to + " amount: " + amount);
			accounts[from] = accounts[from] - amount;
			Thread.sleep((int) (100 * Math.random()));
			accounts[to] = accounts[to] + amount;

			System.out.println("Total balance: " + totalBalance());

		} catch (InterruptedException e) {

		}
	}

	public int totalBalance() {
		int total = 0;
		for (int v : accounts) {
			total = total + v;
		}
		return total;
	}

	public int getNumberAccounts() {
		return numOfAccounts;
	}
}
