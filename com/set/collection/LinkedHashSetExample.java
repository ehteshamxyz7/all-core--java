package com.set.collection;

import java.util.LinkedHashSet;

 class Copy{
	int id;
	String name, author, publisher;
	int quantity;

	public Copy(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Copy> hs = new LinkedHashSet<Copy>();
		// Creating Books
		Copy b1 = new Copy(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Copy b2 = new Copy(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Copy b3 = new Copy(103, "Operating System", "Galvin", "Wiley", 6);

		// Adding Books to hash table
		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		// Traversing hash table
		for (Copy b : hs) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}