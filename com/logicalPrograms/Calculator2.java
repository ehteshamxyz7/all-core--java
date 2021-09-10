package com.logicalPrograms;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		
		String yn;
		do {

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

			default:System.out.println("Invalid symbol");
				break;
			}
			System.out.println("Do u want to continue(press y for YES n for NO)");
			yn = sc.next();
			
		} while (yn.equals("Y") || yn.equals("y"));
	}
}

