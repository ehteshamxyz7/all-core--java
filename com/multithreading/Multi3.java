package com.multithreading;


//implement the runnable interface
public class Multi3 implements Runnable {

	@Override//override the run  method
	public void run() {
		System.out.println("thread task");
	}
	public static void main(String[] args) {
		
		//create an object multi3 class
		Multi3 t =new Multi3();
		
		//create an object of thread class and paas the parameter in constructor
		Thread t1=new Thread(t);
		t1.start();
		
		
	}

}
