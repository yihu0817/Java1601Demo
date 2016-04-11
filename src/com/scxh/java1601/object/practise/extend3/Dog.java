package com.scxh.java1601.object.practise.extend3;

/**
 * super: 表示父类 功能：1.作为 方法名表示父类构造方法。 2.调用隐藏变量和被覆盖的方法
 *
 */
public class Dog extends Animal {
	public String name = "dog";
	public Dog() {
		super("大黄");
		this.name = "小黄";
		System.out.println("Dog构造方法");
		super.say();
		this.say();
	}

	public void say() {
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声");
	}
}
