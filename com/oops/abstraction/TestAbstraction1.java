package com.oops.abstraction;

abstract class Shape {
	abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

//In real scenario, method is called by programmer or user  
class TestAbstraction1 {
	public static void main(String args[]) {
		
		Shape s= new Rectangle();
		s.draw();
		
		
		
		
	}
}