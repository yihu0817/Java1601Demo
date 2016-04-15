package com.scxh.java1601.object.ex02.extend3.practise;

/**
 * 
 * People类： name 姓名 age 年龄 height 身高 say() 说话
 * 
 * 定义一个类 Teacher，它也有 name、age、height 属性和 say() 方法， 另外还需要增加
 * school、seniority、subject 属性和 lecturing() 方法， 先继承 People 类的成员，再增加自己的成员
 * 
 *
 */
public class Teacher extends People {
	public String school; //所在学校
	public String seniority;//职称
	public String subject; //课目
	
	public void lecturing(){
		System.out.println("学校是 :"+school+ "职称是 :"+seniority + " 授课科目是 :"+subject);
	}
	/**
	 * 子类中定义了一个方法与父类中方法相同,叫子类方法覆盖父类方法.
	 * 相同方法： 方法名相同
	 *         参数列表相同
	 *         返回值相同
	 *         修饰相同
	 */
	public void say(){
		System.out.println("身高为"+height+"米，年龄"+age+"岁的"+name+ "老师   正在说话");
	}
}
