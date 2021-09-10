package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatchExample10 {

	public static void main(String[] args) {

		PrintWriter pw;
		try {
			PrintWriter printWriter = new PrintWriter("jpg.text");
			printWriter.println();
		}
		
//providing the checked exception handler  
		catch (FileNotFoundException e) {

			System.out.println(e);
		}
		
		System.out.println("File saved successfully");
	}
}
