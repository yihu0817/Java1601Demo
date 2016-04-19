package com.scxh.java1601.collection.ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1java");
		list.add("2android");
		list.add("3spring");
		list.add("4html");
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String t = iterator.next();
			System.out.println(t);
		}
	}

	
	public void testHashSet(){
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("1java");
		hashSet.add("2j2ee");
		hashSet.add("3android");
		hashSet.add("4spring");
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			String t = iterator.next();
			System.out.println(t);
		}
	}

}
