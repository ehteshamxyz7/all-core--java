package com.list.collection;

//traverse ArrayList elements using the Iterator interface.
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Traversing list through Iterator
		Iterator itr = list.iterator();// getting the Iterator

		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());
		}
	}
}