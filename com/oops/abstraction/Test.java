package com.oops.abstraction;

abstract class Bike1 {
	Bike1() {
		System.out.println("bike............");
	}

	abstract void run();

	void changeGear() {
		System.out.println("gear............");
	}
}

class Honda2 extends Bike1 {
	void run() {
		System.out.println("running safely...");
	}
}

class Test {
	public static void main(String[] args) {
		Bike1 obj = new Honda2();
		obj.run();
		obj.changeGear();
	}
}
