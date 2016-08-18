package com.brainacad.oop.testdeadlock1;

public class MyThread extends Thread {

	private MyObject object1;
	private MyObject object2;
	private MyObject object3;

	public MyThread(String name, MyObject object1, MyObject object2, MyObject object3) {
		this.setName(name);
		this.object1 = object1;
		this.object2 = object2;
		this.object3 = object3;
	}

	public void run() {

		synchronized (object1) {
			System.out.println(Thread.currentThread().getName() + ": Holding lock" + object1.getId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {}
			System.out.println(Thread.currentThread().getName() + ": Waiting for lock" + object2.getId() + " ...");
			synchronized (object2) {
				System.out.println(Thread.currentThread().getName() + ": Holding lock" + object1.getId() + " and lock"
						+ object2.getId());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {}
				System.out.println(Thread.currentThread().getName() + ": Waiting for lock" + object3.getId() + " ...");
				synchronized (object3) {
					System.out.println(Thread.currentThread().getName() + ": Holding lock" + object1.getId()
							+ " and lock" + object2.getId() + " and lock" + object3.getId());

				}
			}
		}

	}
}
