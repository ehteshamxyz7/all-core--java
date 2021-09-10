package com.list.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {

		// Creating a list of fruits
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");

		// Sorting the list
		Collections.sort(list1);

		for (String fruit : list1)
			System.out.println(fruit);
		System.out.println("Shorting number.............");

		// Creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);

		Collections.sort(list2);

		for (Integer number : list2)
			System.out.println(number);
	}

}
