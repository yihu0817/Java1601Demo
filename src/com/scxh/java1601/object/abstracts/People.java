package com.scxh.java1601.object.abstracts;

/**
 * 只给出方法定义而不具体实现的方法被称为抽象方法，
 * 抽象方法是没有方法体的，在代码的表达上就是没有“{}”。
 * 包含一个或多个抽象方法的类也必须被声明为抽象类
 * 
 * 1.抽象类定义  abstract   
 * 2.抽象方法     abstract
 * 3.抽象类是不能实例化的
 * 4.为什么要使用抽象类
 * 
 */
public abstract class People {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract void work();
}
