package com.set.collection;

import java.util.ArrayList;

import java.util.List;

public class ListRemove {
public static void main(String[] args) {
	
	List<String> list = new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	 System.err.println(" asad  "+list);
	
	
	List<String> list1 = new ArrayList<>();
	list1.add("a");
	list1.add("b");
	list1.add("d");
	list1.add("e");
	System.err.println("sakib  "+list1);
	
	
	boolean all = list.removeAll(list1);
	System.out.println("all data   "+all);
	
}
}
