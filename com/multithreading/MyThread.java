package com.multithreading;

//performance multiple task from multiple thread
class Testt1 extends Thread {
	public void run() {
		System.out.println("playing video");
	}

}

class Test3 extends Thread {
	public void run() {
		System.out.println("playing music");
	}

}

class Test4 extends Thread {
	public void run() {
		System.out.println("process bar is executing");
	}

}

public class MyThread {
	public static void main(String[] args) {
		Testt1 testt1 = new Testt1();
		testt1.start();

		Test3 test3 = new Test3();
		test3.start();

		Test4 test4 = new Test4();
		test4.start();

	}

}