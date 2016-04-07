package com.scxh.java1601.object.practise.extend3;
/**
 * this 表示当前类对象，通过this.可以调用成员变量和成员方法.
 * 作用1.区别同名变量
 *
 */
public class Animal {
	public String name;
	public Animal() {
		System.out.println("Animal构造方法 无参");
	}

	public Animal(String name) {
		this.name = name;
		System.out.println("Animal构造方法 带参 ");
	}
	
	public void say(){
		System.out.println("我是一只小动物，我的名字叫" + name + "，我会发出叫声");
	}
}
