package com.oops.object.classes;

public class Student22 {

	int rollno;  
	String name,course;  
	float fee;  
	
	Student22(int rollno,String name,String course){  
	this.rollno=rollno;  
	this.name=name;  
	this.course=course;  
	}  
	Student22(int rollno,String name,String course,float fee){  
	this(rollno,name,course);//reusing constructor  
	this.fee=fee;  
	}  
	
	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);}  
	}  
	class TestThis7{  
	public static void main(String args[]){  
	Student22 s1=new Student22(111,"ankit","java");  
	Student22 s2=new Student22(112,"sumit","java",6000f);  
	s1.display();  
	s2.display();  
	
	}
}  
