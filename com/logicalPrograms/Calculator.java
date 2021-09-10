package com.logicalPrograms;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter Scond number");
		int n2 = sc.nextInt();
		System.out.println("Select symbol(+,-,*,/)");
		String sym = sc.next();

		int res;
		switch (sym) {
		case "+":
			res = n1 + n2;
			System.out.println("Addiotion is : " + res);

			break;
		case "-":
			res = n1 + n2;
			System.out.println("Subtraction is : " + res);
			break;
		case "*":
			res = n1 + n2;
			System.out.println("Multiplication is : " + res);
			break;
		case "/":
			res = n1 + n2;
			System.out.println("Division is : " + res);
			break;

		default:
			break;
		}

	}

}
