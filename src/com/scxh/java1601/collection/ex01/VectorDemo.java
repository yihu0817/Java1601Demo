package com.scxh.java1601.collection.ex01;

import java.util.Vector;

import com.scxh.java1601.object.ex01.test.Student;

public class VectorDemo {

	public static void main(String[] args) {
		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		Student studentD = new Student("麻子", 25, 333, "女");
		
		Vector<Student> vector = new Vector<Student>();
		vector.add(studentA);
		vector.add(studentB);
		vector.add(studentC);
		vector.add(studentD);
		
		Student stu = vector.get(0);
		
	}

}
