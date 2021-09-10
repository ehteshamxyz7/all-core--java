package com.oops.abstraction;

interface Printable4 {
	void print();
}

interface Showable {
	void print();
}

class TestInterface3 implements Printable4, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}
}
