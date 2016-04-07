package com.scxh.java1601.object.practise.extend2;

public class Dog extends Animal {
	
	public void move() {
		super.move(); // 调用父类的方法
		System.out.println("Dogs can walk and run");
		// 通过 getter 方法调用父类隐藏变量
		String desc = super.getDesc();
		System.out.println("Please remember: " + desc);
	}
}
