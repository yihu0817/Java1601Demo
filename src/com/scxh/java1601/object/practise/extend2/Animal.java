package com.scxh.java1601.object.practise.extend2;

public class Animal {
	private String desc = "Animals are human's good friends";

	// 必须要声明一个 getter 方法
	public String getDesc() {
		return desc;
	}

	public void move() {
		System.out.println("Animals can move");
	}

}
