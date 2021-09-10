package com.multithreading;


//extend the thread class
public class Multi extends Thread{
	
    //override the run method
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		
		//create an object of multi class
		Multi ti= new Multi();
		
		//invoke thr thread
		ti.start();
		

	}
}
