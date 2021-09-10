package com.basic.program;

public class AverageofnumbersArrar {

	public static void main(String[] args) {
		double[] arr = { 10, 40, 50, 200, 10.5 };
		double total = 0;

		for (int i = 0; i < arr.length; i++) {

			total = total + arr[i];
		}

		double avg = total / arr.length;

		System.out.format("the avg is: %.3f", avg);

	}

}
