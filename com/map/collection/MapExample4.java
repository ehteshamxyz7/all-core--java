package com.map.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapExample4 {

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		// Returns a Set view of the mappings contained in this map
		map.entrySet().stream()

				.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))

				.forEach(System.out::println);
	}
}
