package com.oops.Encapsulation;

//A Java class to test the encapsulated class Account.  
public class TestEncapsulation {
	public static void main(String[] args) {
		// creating instance of Account class
		Account5 acc = new Account5();
		// setting values through setter methods
		acc.setAcc_no(7560504000L);
		acc.setName("Ehtesham Alam");
		acc.setEmail("ehtesham.xyz7@gmail.com");
		acc.setAmount(5000f);
		// getting values through getter methods
		System.out.println(acc.getAcc_no() + "  " + acc.getName() + "  " + acc.getEmail() + "  " + acc.getAmount());
	}
}