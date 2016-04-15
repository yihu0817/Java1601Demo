package com.scxh.java1601.object.ex01;



public class TestAnimal {

	public static void main(String[] args) {
		TestAnimal test = new TestAnimal();
		test.testAnimal1();
	}
	/**
	 * 初始化对象：通过对象名.属性 
	 */
	public void testAnimal1(){
		Animal dogAnimal = new Animal(); // dogAnimal对象 表示年龄是3岁，毛色是灰色的狗
		dogAnimal.name = "狗";
		dogAnimal.color = "灰色";
		dogAnimal.age = 3;

		Animal catAnimal = new Animal(); // animal2对象 表示年龄是2岁，毛色是白色的猫
		catAnimal.name = "猫";
		catAnimal.color = "白色";
		catAnimal.age = 4;
		
		catAnimal.eat();
		dogAnimal.howl();
	}
	/**
	 * 初始化对象: 通过构造方法
	 */
	public void testAnimal2(){
		 //类型    对象名称   =  new 类型();
		Animal dogAnimal = new Animal("小狗","灰色",3); // dogAnimal对象 表示年龄是3岁，毛色是灰色的狗
		Animal catAnimal = new Animal("小猫","白色",4); // animal2对象 表示年龄是2岁，毛色是白色的猫
		catAnimal.eat();
		dogAnimal.howl();
	}

}
