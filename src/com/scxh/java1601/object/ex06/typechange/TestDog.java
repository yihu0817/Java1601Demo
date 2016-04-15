package com.scxh.java1601.object.ex06.typechange;
/**
 * 复习 ： 基本数据类型转换
 * 
 * Java对象类型转型知识
 * 1.向上转型： 父类对象引用子类实例
 * 2.向下转型: 子类对象引用已经向上转型后的父类对象
 *
 */
public class TestDog {

	public static void main(String[] args) {
		Animal obj1 = new Animal();  //obj1引用父类实例
		obj1.say();
		
		obj1 = new Dog(); //obj1引用子类实例   ;向上转型：父类对象引用子类实例
		obj1.say();
		
		if(obj1 instanceof Dog){
			System.out.println("obj1 是Dog类型");
			Dog obj2 = (Dog)obj1;  //向下转型  ： 子类对象引用已经向上转型后的父类对象
			obj2.call();
		}else{
			System.out.println("obj1 不是Dog类型");
		}
	}

}
