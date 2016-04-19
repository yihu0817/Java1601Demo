package com.scxh.java1601.collection.practise01;

public class Teacher {
	private String name;
	private int age;

	public Teacher(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Teacher(){
		
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}

	
}
