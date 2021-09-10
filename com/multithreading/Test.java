package com.multithreading;

//performing single task from single thread

public class Test extends Thread{
	
	public void run( ) {
		System.out.println("task 1");
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.start();
	}
	

}
