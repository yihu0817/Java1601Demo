package com.scxh.java1601.collection.ex01;

import java.util.Stack;

import com.scxh.java1601.object.ex01.test.Student;

public class StackDemo {

	public static void main(String[] args) {
		//定义一个存储学生对象的堆栈
		Stack<Student> studentStack = new Stack<Student>();
		
		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		
		studentStack.push(studentA); //压栈
		studentStack.push(studentB);
		studentStack.push(studentC);
		
		System.out.println(studentStack.size());
		
		Student topStudent = studentStack.pop();  //弹栈
		System.out.println(topStudent);
		
		System.out.println(studentStack.size());
		
		//--------------------------
		topStudent = studentStack.pop();
		System.out.println(topStudent);
		
		System.out.println(studentStack.size());
	
		//----------------------
		topStudent = studentStack.pop();
		System.out.println(topStudent);
		
		System.out.println(studentStack.size());
	}

}
