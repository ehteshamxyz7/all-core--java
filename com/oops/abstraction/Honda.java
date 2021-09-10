package com.oops.abstraction;

abstract class Honda {
	abstract void run();

}

class Bike extends Honda {

	void run() {
		System.out.println("running    safely");
	}

	public static void main(String[] args) {

		Honda honda=new Bike();
		honda.run();

	}

	
}
