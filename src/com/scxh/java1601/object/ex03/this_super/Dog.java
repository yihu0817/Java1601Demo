package com.scxh.java1601.object.ex03.this_super;

/**
 * 子类Dog 如果在新类中定义一个方法，其名称、返回值类型和参数列表正好与父类中的相同，那么，新方法被称做覆盖旧方法。
 * 
 * 总结: 适用场景 1.重载： 出现在 同 一类中或者子类与父类中， 2.覆盖: 只能出现在 子类与父类中
 * 
 */
public class Dog extends Animal {
	public String color;
	public String name;

	public Dog(String name) {
		super(name); // 作为方法名表示 父类构造方法 ;
	}
	public Dog() {
		super("大黄");
		this.name = "小黄";
		System.out.println("Dog构造方法");
		super.say();
		this.say();
	}
	// 覆盖say() 方法
	public void say() {
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声");
	}

	// 重载say()方法
	public void say(String msg) {
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声" + msg);
	}

	public void call() {
		this.color = "红色";
		this.name = "小红";
		this.say();
		super.name = "大红";
		super.say();
	}

	public void superSay() {
		super.say();//super方法调用父类隐藏变量
	}
}
