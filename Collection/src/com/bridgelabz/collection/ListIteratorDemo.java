package com.bridgelabz.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("abhi");
		l.add("vinay");
		l.add("vishal");
		System.out.println(l);
		 
	    ListIterator<String> Itr =  l.listIterator();
		while(Itr.hasNext()) {
			String s = (String)Itr.next();
			if(s.equals("abhi")) {
				Itr.remove();
			} else if(s.equals("vinay")) {
				Itr.add("Rishi");
			} else if(s.equals("vishal")) {
				Itr.set("Singh");
			}
		}
		
		System.out.println(l);
		

	}

}
