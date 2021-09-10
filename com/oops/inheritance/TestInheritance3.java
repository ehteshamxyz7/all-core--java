package com.oops.inheritance;

 class Animal1{

	  void eat(){
		  System.out.println("eating...");}  
  }  
  class Dogy extends Animal{  
  void bark(){
	  System.out.println("barking...");}  
  }  
  class Dogg extends Animal{  
  void meo(){
	  System.out.println("meowing...");}  
  }  
  class TestInheritance3{  
  public static void main(String args[]){  
  Cat c=new Cat();    
  c.eat();  
  c.bark();//C.T.Error  
  
  }
 }  
