package com.scxh.java1601.object.practise.extend1;

/**
 * this 关键字用来表示当前类对象本身，或当前类的一个实例，通过this 可以调用本对象的所有方法和属性。
 */
public class Animal {
	String name;

	public Animal(){
		this("黄黄");  //第二个作用 : 作为构造方法名初始化对象
	}
	
	public Animal(String name) {
		this.name = name; //第一个作用: 区为同名变量
	}

	public void say() {
		System.out.println("我是一只小动物，我的名字叫" + name + "，我会发出叫声");
	}

}
