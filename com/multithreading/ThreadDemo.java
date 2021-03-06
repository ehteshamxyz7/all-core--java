package com.multithreading;

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(() -> {

			for (int i = 1; i <= 5; i++) {

				System.out.println("Hi" +Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});

		Thread t2 = new Thread(() -> {

			for (int i = 1; i <= 5; i++) {

				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		});

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println("bye");

	}

}
