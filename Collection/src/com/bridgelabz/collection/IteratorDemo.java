package com.bridgelabz.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =0; i<=10 ;i++) {
			al.add(i);
		}
		System.out.println(al);
		
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer I = itr.next();
			if(I%2==0) {
				System.out.println(I);
			}else {
				itr.remove();
		 	}
		}
		
		System.out.println(al);

	}

}
