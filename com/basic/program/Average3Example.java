package com.basic.program;

import java.util.Scanner;

public class Average3Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		double n1 = sc.nextDouble();
		System.out.println("Enter the scond number");
		double n2 = sc.nextDouble();
		System.out.println("Enter third number");
		double n3 = sc.nextDouble();

		sc.close();

		System.out.println("the avorage in enter is: " + avr(n1, n2, n3));

	}

	public static double avr(double a, double b, double c) {

		return (a + b + c) / 3;
	}

}
