package com.oops.abstraction;

interface AA {
	void a();// bydefault, public and abstract

	void b();

	void c();

	void d();
}

//Creating abstract class that provides the implementation of one method of A interface  
abstract class BB implements AA {
	public void c() {
		System.out.println("I am C");
	}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class MM extends BB {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}
}

//Creating a test class that calls the methods of A interface  
class Test10 {
	public static void main(String args[]) {
		AA a = new MM();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}