package com.oops.abstraction;

interface Bank11 {
	float rateOfInterest();
}

class SBI1 implements Bank11 {
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB1 implements Bank11 {
	public float rateOfInterest() {
		return 9.7f;
	}
}

class TestInterface2 {
	public static void main(String[] args) {
		Bank11 b = new SBI1();
		System.out.println("RIO " +b.rateOfInterest());
	}
}