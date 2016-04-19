package com.scxh.java1601.collection.practise01;

import com.scxh.java1601.object.ex01.test.Student;

public class ArrayQueueFTest {

	public static void main(String[] args) {
		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		Student studentD = new Student("麻子", 25, 333, "女");
		Student studentE = new Student("王小二", 25, 333, "女");
		
		ArrayQueueF<Student> queue = new ArrayQueueF<Student>();
		queue.add(studentA);
		queue.add(studentB);
		queue.add(studentC);
		queue.add(studentD);
		queue.add(studentE);
		queue.add(studentA);
		
		Student student = queue.get();
		System.out.println(student);
		
		student = queue.get();
		System.out.println(student);
		
		student = queue.get();
		System.out.println(student);
		
		student = queue.get();
		System.out.println(student);
		
		student = queue.get();
		System.out.println(student);
	
	}

}
