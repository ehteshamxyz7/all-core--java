package com.corejava.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IterateElements {

	public static void main(String[] args) {

		List<Integer> List = new ArrayList<>();
		List.add(1);
		List.add(5);
		List.add(3);
		List.add(4);
		List.add(9);

		Collections.sort(List);
		System.out.println(List);

	}
}

// @formatter:off

// @formatter:on

/*
 * for (int i = 0; i < List.size(); i++) { System.out.println(List.get(i));
 */

/*
 * Iterator<Integer> itr = List.iterator(); while (itr.hasNext()) {
 * System.out.println(itr.next());
 * 
 * for (Integer s : List) { System.out.println(s);
 * 
 * }
 * 
 * // sorting of list
 * 
 * List<Integer> List1 = new ArrayList<>(); List1.add(1); List1.add(5);
 * List1.add(3); List1.add(4); List1.add(9); Collections.sort(List1);
 * 
 * System.out.println(List1);
 * 
 * for (Integer i : List1) { System.out.println(i);
 * 
 * }
 * 
 * List<String> arrayList = new ArrayList<String>(); arrayList.add("javed");
 * arrayList.add("zeeshan"); arrayList.add("mohammad"); arrayList.add("aatif");
 * arrayList.add("zubair");
 * 
 * Collections.sort(arrayList);
 * 
 * System.out.println(arrayList); for (String s : arrayList) {
 * System.out.println(s);
 * 
 * }
 * 
 * }
 */
