package com.multithreading;

class Q {
	int num;
	boolean valueSet;

	public synchronized void put(int num) {
		System.out.println("Put : " + num);
		while (valueSet) {

			try {wait();} catch (Exception e) {}
		}
		this.num = num;
		valueSet = true;
		notify();
	}

	public synchronized void get() {
		while (!valueSet) {
			try {wait();} catch (Exception e) {}
			
		}
		System.out.println("Get : " + num);
		valueSet=false;
		notify();

	}

}

class Producer implements Runnable {

	Q q;

	public Producer(Q q) {

		this.q = q;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	public void run() {
		int i = 0;
		while (true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}

		}

	}

}

class Consumer implements Runnable {
	Q q;

	public Consumer(Q q) {
		this.q = q;
		Thread t = new Thread(this, "Consumer");
		t.start();
		this.q = q;
	}

	@Override
	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			}

		}

	}
}

public class InterThread {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}
