package com.scxh.java1601.collection.ex01;

import java.util.HashSet;

import com.scxh.java1601.collection.practise01.Teacher;
/**
 * HashSet
 * 特点：无序不重复元素
 * 
 * 
 * @author zhou.sir
 *
 */
public class HashSetTest {

	public static void main(String[] args) {

		HashSet<Teacher> hashSet = new HashSet<Teacher>();

		Teacher t1 = new Teacher("张sir", 25);
		Teacher t2 = new Teacher("李sir", 35);
		Teacher t4 = new Teacher("王sir", 45);
		Teacher t3 = new Teacher("麻sir", 55);

		hashSet.add(t1);
		hashSet.add(t2);
		hashSet.add(t3);
		hashSet.add(t4);

		System.out.print(hashSet);
	

	}
}
