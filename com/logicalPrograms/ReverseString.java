package com.logicalPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String name="Ehtesham";
		int length = name.length();
		String rev="";
		for (int i=length-1; i>=0; i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println("Reverse of "+ name +" is "+rev);
	}

}
