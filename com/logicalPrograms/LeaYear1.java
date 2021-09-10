package com.logicalPrograms;

public class LeaYear1 {

	public static void main(String[] args) {

		int year = 2024;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(" not aleap year");

				} else {

				}

			} else {
				System.out.println("leap year");

			}

		} else {
			System.out.println("not a leap year");

		}

	}

}
