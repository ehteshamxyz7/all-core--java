package com.multithreading;


//performing single task from multiple thread

public class Test1 extends Thread {
	public void run() {
		System.out.println("task 1");
	}
	public static void main(String[] args) {
		Test1 t= new Test1();
		t.start();
		
		Test1 t2= new Test1();
		t2.start();
		
		Test1 t3= new Test1();
		t3.start();
	}

}
