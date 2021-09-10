package com.oops.abstraction;

interface Printable78 {
	void print();
}

interface Showable5 extends Printable78{
	void show();
}

class TestInterface4 implements Showable5 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
	}
}
