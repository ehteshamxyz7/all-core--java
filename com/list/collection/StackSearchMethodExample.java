package com.list.collection;

import java.util.Stack;

public class StackSearchMethodExample {

	private static final Object HP = null;

	public static void main(String[] args) {

		Stack<String> stk = new Stack<>();

		// pushing elements into Stack
		stk.push("Mac Book");
		stk.push("HP");
		stk.push("DELL");
		stk.push("Asus");
		System.out.println("Stack: " + stk);

		// Search an element
  int location=stk.search("HP");
  System.out.println("Location of dell: "+location);

	}
}