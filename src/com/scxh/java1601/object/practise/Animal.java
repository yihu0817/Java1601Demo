package com.scxh.java1601.object.practise;
/**
 * 动物类
 *
 */
public class Animal {
	String name; // 名称
	String color; // 毛色
	int age; // 年龄
	
	/**
	 * 构造方法
	 * 1.方法名称与类名相同
	 * 2.没有返回值
	 * 3.进行初始化操作
	 * 
	 * 
	 * @param n
	 * @param c
	 * @param a
	 */
	public Animal(String n, String c, int a){
		name = n;
		color = c;
		age = a;
	}
	
	/**
	 * 吃东西
	 */
	public void eat() {
		System.out.println("年龄"+age+"岁，毛色是"+color+"的"+name+"正在吃东西");
	}
    /**
     * 叫
     */
	public void howl() {
		System.out.println("年龄"+age+"岁，毛色是"+color+"的"+name+"正在叫");
	}
}
