package com.exceptionhandling;

public class TestFinallyBlock {

	public static void main(String[] args) {

		try {
			int data = 25 / 5;
			System.out.println(data);

		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always execute");
		}
		System.out.println("rest of the code");
	}
}