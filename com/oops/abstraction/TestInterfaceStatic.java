package com.oops.abstraction;

interface Drawable60 {
	void draw();

	static int cube(int x) {
		return x * x * x;
	}
}

class Rectangle18 implements Drawable60 {
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic {
	public static void main(String args[]) {
		Drawable60 d = new Rectangle18();
		d.draw();
		System.out.println(Drawable60.cube(3));
	}
}
