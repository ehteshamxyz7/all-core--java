package com.list.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {

		// Creating user-defined class objects
		Student s1 = new Student(101, "Ehtesham ALam", 26);
		Student s2 = new Student(102, "Aaamir khan", 23);
		Student s3 = new Student(103, "Asadullah", 22);

		List<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);

		// Getting Iterator
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st =(Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}