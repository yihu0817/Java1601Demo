package com.scxh.java1601.io.ex01;

import java.io.Serializable;

public class Student implements Serializable{
	public String name; // 姓名
	public int age; // 年龄
	public int number; // 学号
	public int byteCount;//字节数

	public Student(String name, int age, int number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}

	@Override
	public String toString() {
		return "学生 [姓名=" + name + ", 年龄=" + age + ", 学号=" + number
				+ "]";
	}
	
	
}
