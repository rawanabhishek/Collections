package com.bridgelabz.collection;

import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<Object>();
		l.add("abhi");
		l.add(30);
		l.add(null);
		l.add("rawan");
		l.set(0, "Java");
		l.add(0, "jvm");
		l.removeLast();
		l.addFirst("abc");
		System.out.println(l);

	}

}
