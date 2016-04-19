package com.scxh.java1601.collection.ex01;

import com.scxh.java1601.object.ex01.test.Student;

public class MyQuqueTest {

	public static void main(String[] args) {
		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		
		MyQueque<Student> queue = new MyQueque<Student>();
		queue.insertQueuqeLast(studentA);
		queue.insertQueuqeLast(studentB);
		queue.insertQueuqeLast(studentC);
		
		Student firstStudent = queue.getQueuqeFirst();
		System.out.println(firstStudent);
		
		firstStudent = queue.getQueuqeFirst();
		System.out.println(firstStudent);
		
		firstStudent = queue.getQueuqeFirst();
		System.out.println(firstStudent);
	}

}
