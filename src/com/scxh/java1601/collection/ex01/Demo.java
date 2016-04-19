package com.scxh.java1601.collection.ex01;

public class Demo {

	public static void main(String[] args) {
	
	}
	
	public void test(){
		int[] a = new int[10];
		int length = a.length;
		System.out.println(length);
		
		String b = "abcdef";
		int size = b.length();
		System.out.println(size);
		
		boolean f = b.contains("abc");
		System.out.println(f);
	}

}
