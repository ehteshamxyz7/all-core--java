package com.listInterface.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListExample {

	public static void main(String[] args) {

		// Creating Array
		String[] array = { "JAva", "Python", "Php", "C++" };
		System.out.println("Print Array: " + Arrays.toString(array));

		// convertin array to list
		List<String> list = new ArrayList<String>();
		for (String s : array) {

			list.add(s);
		}
		System.out.println("Printing list: "+list);

	}
}
