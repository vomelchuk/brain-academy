package com.brainacad.oop.testthread8;

public class BankTest {
	public static final int N_ACCOUNTS = 5;
	public static final int INIT_BALANCE = 1000;

	public static void main(String[] args) {
		Bank bank = new Bank(N_ACCOUNTS, INIT_BALANCE);
		Transfer[] transfers = new Transfer[N_ACCOUNTS];
		int from = 0;
		for (Transfer transfer : transfers) {
			transfer = new Transfer(bank, from++, INIT_BALANCE);
			new Thread(transfer).start();
		}
	}

}
