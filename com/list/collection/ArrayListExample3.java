package com.list.collection;

import java.util.ArrayList;

// traverse the ArrayList elements using the for-each loop
public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Traversing list through for-each loop
for(String fruits : list)
	System.out.println(fruits);
		
	}

}