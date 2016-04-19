package com.scxh.java1601.collection.ex01;

import java.util.LinkedList;

import com.scxh.java1601.object.ex01.test.Student;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Student> listQueque = new LinkedList<Student>();

		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");

		listQueque.addLast(studentA);
		listQueque.addLast(studentB);
		listQueque.addLast(studentC);

		Student studentFirst = listQueque.removeFirst();
		System.out.println(studentFirst);

		studentFirst = listQueque.removeFirst();
		System.out.println(studentFirst);

	}

}
