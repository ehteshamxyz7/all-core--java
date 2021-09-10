package com.oops.object.classes;


//use for  static variable
public class Emloyee {
	  
	 int id;  
	    String name;
	    
	    //constructor to initialize integer and string  
	    Emloyee(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    //constructor to initialize another object  
	    Emloyee(Student6 s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    
	    void display(){
	    	System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    Student6 s1 = new Student6(111,"Karan");  
	    Student6 s2 = new Student6(s1);  
	    s1.display();  
	    s2.display();
	    
	   }  
	}  


       
	