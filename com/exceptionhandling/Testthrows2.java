package com.exceptionhandling;

import java.io.IOException;

public class Testthrows2 {
	void method() throws IOException {
		throw new IOException("device error");
	}


	public static void main(String args[]) {
		try {
			Testthrows2 t= new Testthrows2();
			t.method();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}
