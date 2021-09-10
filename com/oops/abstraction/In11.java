package com.oops.abstraction;

interface Printable3 {
	void print();
}

interface Showable3 {
	void show();
}

class In11 implements Printable3, Showable3 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		In11 obj = new In11();
		obj.show();
		obj.print();
	}
}