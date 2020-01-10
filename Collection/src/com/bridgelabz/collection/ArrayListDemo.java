package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		List<Object> al= new ArrayList<Object>();
		al.add("A");
	
		al.add(10);
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(1, "M");
		al.add("N");
		System.out.println(al);
	}	

}
