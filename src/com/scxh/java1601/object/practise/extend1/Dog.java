package com.scxh.java1601.object.practise.extend1;

/**
 * 子类Dog 
 * 如果在新类中定义一个方法，其名称、返回值类型和参数列表正好与父类中的相同，那么，新方法被称做覆盖旧方法。
 * 
 * 总结:
 *  适用场景
 * 1.重载： 出现在 同 一类中或者子类与父类中，
 * 2.覆盖: 只能出现在 子类与父类中
 * 
 */
public class Dog extends Animal {

	public Dog(String name) {
		super(name); // 调用父类构造方法 ; 可以在子类中通过super关键字调用父类构造方法
	}

	// 覆盖say() 方法
	public void say() {
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声");
	}
	
	//重载say()方法
	public void say(String msg){
		System.out.println("我是一只小狗，我的名字叫" + name + "，我会发出汪汪的叫声"+msg);
	}

}
