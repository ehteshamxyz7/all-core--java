package com.oops.abstraction;

interface Drawable70 {
	void draw();

	default void msg() {
		System.out.println("default method");
	}
}

class Rectangle15 implements Drawable70 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceDefault {
	public static void main(String args[]) {
		Drawable70 d = new Rectangle15();
		d.draw();
		d.msg();
	}
}