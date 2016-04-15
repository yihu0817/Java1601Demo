package com.scxh.java1601.object.ex02.extend3.practise;
/**
 *  Object类 
 *
 */
public class People{
	public String name;// 姓名
	public int age;// 年龄
	public float height;// 身高

	
	/**
	 * 说话
	 */
	public void say() {
		System.out.println("身高为"+height+"米，年龄"+age+"岁的"+name+ "人   正在说话");
	}
}
