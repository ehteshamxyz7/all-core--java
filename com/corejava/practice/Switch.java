package com.corejava.practice;

public class Switch {

	public static void main(String[] args) {

		char grade = 'C';
		switch (grade) {
		case 'A':
			System.out.println("grade is good ");

			break;
		case 'B':
			System.out.println("very good ");
			break;
		case 'C':
			System.out.println("nice ");
			break;

		default:
			System.out.println("wrong argument.............");
		}
	}

}
