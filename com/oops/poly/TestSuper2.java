package com.oops.poly;

class Animal4 {

	void eat() {
		System.out.println("eating...");
	}
}

class Dog4 extends Animal4 {
	void eat() {
		System.out.println("eating bread...");
	}

	void bark() {
		System.out.println("barking...");
	}

	void work() {
		super.eat();
		bark();
	}
}

class TestSuper2 {
	public static void main(String args[]) {
		Dog4 d = new Dog4();
		d.work();
	}
}
