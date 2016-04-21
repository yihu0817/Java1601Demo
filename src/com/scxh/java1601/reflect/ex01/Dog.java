package com.scxh.java1601.reflect.ex01;

import com.scxh.java1601.util.Log;

public class Dog extends Animal {
	private String name;
	private int age;
	private boolean sex;
	
	public Dog(){
		
	}
	public Dog(String name){
		
	}
	
	public Dog(String name,int age,boolean sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	@Override
	public void eat() {
		Log.d("Dog 能吃东西");
	}
	
	public String show(){
		Log.d("显示信息");
		return "";
	}
	public int run(float km,int r){
		Log.d("已跑距离"+km);
		return 0;
	}

}
