package com.oops.object.classes;

public abstract class Demo1 {

	//abstract method declaration  
	abstract void display();  
	}  
	class MyClass extends Demo  
	{  
	//method impelmentation  
	void display()  
	{  
	System.out.println("Abstract method?");  
	}  
	public static void main(String args[])  
	{  
	//creating object of abstract class  
	MyClass obj = new MyClass();  
	//invoking abstract method  
	obj.display(); 
	
	}
}
