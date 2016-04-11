package com.scxh.java1601.object.abstracts;

public class Driver extends People {

	@Override
	public void work() {
		System.out.println("我的名字叫" + this.getName() + "，我正在开车，不能接听电话...");
	}

}
