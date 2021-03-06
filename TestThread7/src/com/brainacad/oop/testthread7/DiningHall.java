package com.brainacad.oop.testthread7;

public class DiningHall {
	static int pizzaNum;
	static int studentID;

	public void makePizza() {
		pizzaNum++;
	}

	public synchronized void servePizza() {
		String result;
		if (pizzaNum > 0) {
			result = "Served ";
			pizzaNum--;
		} else
			result = "Starved ";
		System.out.println(result + studentID);
		studentID++;
	}

	public static void main(String[] args) {
		DiningHall d = new DiningHall();

		for (int i = 0; i < 10; i++)
			d.makePizza();
		for (int i = 0; i < 20; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					d.servePizza();
				}
			}).start();
		}

	}
}