package com.logicalPrograms;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no = sc.nextInt();
		int fact = 1;
		for (int i = no; i >=1; i--) {
			fact = fact * i;

		}
		System.out.println("factorial of "+no+" is "+fact);

	}

}
