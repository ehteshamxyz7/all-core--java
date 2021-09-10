package com.corejava.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] array = { "java", "python", "phd", "spring" };
		System.out.println("print array: " + Arrays.toString(array));

		List<String> list = new ArrayList<>();
		for (String string : array) {
			list.add(string);
			
			System.out.println(list); 
			
		}
			

	}

}
