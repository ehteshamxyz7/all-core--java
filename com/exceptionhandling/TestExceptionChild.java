package com.exceptionhandling;

class Parent {
	void msg() throws RuntimeException {
		System.out.println("parent");
	}

}

class TestExceptionChild extends Parent {
	void msg()  {
		System.out.println("TestExceptionChild");

	}

	public static void main(String[] args) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}
