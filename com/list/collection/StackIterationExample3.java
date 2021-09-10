package com.list.collection;

import java.util.ListIterator;
import java.util.Stack;

public class StackIterationExample3 {

	public static void main(String[] args) {

		Stack<Integer> stk = new Stack<>();
		stk.push(119);
		stk.push(203);
		stk.push(988);
		
		ListIterator<Integer> listIterator = stk.listIterator();
		System.out.println("Iteration over the Stack from top to bottom");
		while (listIterator.hasNext()) {
			Integer avg = (Integer) listIterator.next();
			System.out.println(avg);
			
		}
		
		}
	}
