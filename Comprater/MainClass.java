package Comprater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {

		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Ehtesham", 23));
		al.add(new Student(106, "Aamir", 27));
		al.add(new Student(104, "Asadullah", 21));
		al.add(new Student(105, "Arshad", 24));
		al.add(new Student(102, "Sakib", 29));

		Collections.sort(al,new AgeComparator());
		al.forEach(System.out::println);
		
	}
}