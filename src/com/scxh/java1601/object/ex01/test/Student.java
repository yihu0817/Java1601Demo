package com.scxh.java1601.object.ex01.test;

public class Student {
	public String name; // 姓名
	public int age; // 年龄
	public int id; // 编号
	public String sex; // 性别

	public Student(){
		
	}
	
	public Student(String name, int age, int id, String sex) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.sex = sex;
	}

	/**
	 * 学习
	 */
	public void learn() {

	}

	/**
	 * 打游戏
	 */
	public void playeGame() {

	}

	/**
	 * 耍朋友
	 */
	public void makeFriend() {

	}

	/**
	 * 返回类对象字符串信息，在没有重写(覆盖)之前返回的是对象的hashCode,
	 * 
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", id=" + id
				+ ", sex=" + sex + "]";
	}
	
	
}
