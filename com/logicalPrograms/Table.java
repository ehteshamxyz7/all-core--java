package com.logicalPrograms;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to print table");

		int t = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			// System.out.println(t * i);
			System.out.println(t + " * " + i + " =" + t * i);

		}
	}

}
