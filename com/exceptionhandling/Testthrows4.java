package com.exceptionhandling;

import java.io.IOException;

public class Testthrows4 {
		void method() throws IOException {
			throw new IOException("device error");
		}
	

		   public static void main(String args[])throws IOException{//declare exception  
			   Testthrows4 t= new Testthrows4();
		     t.method();  
		  
		    System.out.println("normal flow...");  
		  }  
		}
