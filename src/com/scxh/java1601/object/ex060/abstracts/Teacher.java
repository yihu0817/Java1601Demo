package com.scxh.java1601.object.ex060.abstracts;

/**
 * 子类继承父类，如果父类是抽象类有抽象方法，子类必须实现抽象方法. 
 *
 */
public class Teacher extends People {

	public void work() {
		System.out.println("我的名字叫" + this.getName() + "，我正在讲课，请大家不要东张西望...");
	}

}
