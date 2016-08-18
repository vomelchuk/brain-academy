package com.brainacad.oop.testthread8;

import java.util.Random;

public class Transfer implements Runnable {
	private Bank bank;
	private int from;
	private int max;

	public Transfer(Bank bank, int from, int max_amount) {
		this.bank = bank;
		this.from = from;
		max = max_amount;
	}

	@Override
	public void run() {
		Random rnd = new Random();
		while (true) {
			int to = rnd.nextInt(bank.getNumberAccounts());
			int sum = rnd.nextInt(max);
			if (from == to || sum == 0)
				continue;
			bank.transfer(from, to, sum);
		}

	}

}
