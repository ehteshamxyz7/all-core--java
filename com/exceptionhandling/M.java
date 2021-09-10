package com.exceptionhandling;

import java.io.IOException;

 class M{
	void method() throws IOException {
		throw new IOException("device error");
	}


	public static void main(String args[]) {
		try {
			
			M r= new M();
			r.method();
		}
		catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}