package com.basic.program;

public class Arrayreverseorde {

	public static void main(String[] args) {

		Integer[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		System.out.println("Original array");

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i] + " ");

		System.out.println();
		System.out.println("reverse order");

		for (int i1 = arr.length - 1; i1 >= 0; i1--)
			System.out.println(arr[i1] + " ");

	}

}
