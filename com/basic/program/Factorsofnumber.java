package com.basic.program;

import java.util.Scanner;

public class Factorsofnumber {

	public static void main(String[] args) {
		
		int number,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("number of find factor: ");
		number= sc.nextInt();
		
		for (i= 1; 1 <=number; i++) {
			
			if (number%i==0) {
				System.out.format("%d ",i);
				
			}
			
		}
		
	}

}
