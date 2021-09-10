package com.corejava.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> List = new ArrayList<>();
		List.add(10);
		List.add(5);
		List.add(3);
		List.add(4);
		List.add(9);
		
		Integer[] array=List.toArray(new Integer[List.size()]);
		System.out.println("print aray: "+Arrays.toString(array));
		System.out.println("prin t list:"+List);
	}

}
