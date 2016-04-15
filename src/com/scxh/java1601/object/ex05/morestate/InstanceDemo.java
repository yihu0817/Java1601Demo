package com.scxh.java1601.object.ex05.morestate;

/**
 * 多态性带来了一个问题，就是如何判断一个变量所实际引用的对象的类型 。
 * Java 使用 instanceof 操作符。 
 * instanceof
 * 运算符用来判断一个变量所引用的对象的实际类型，注意是它引用的对象的类型，不是变量的类型。
 *
 */
public class InstanceDemo {

	public static void main(String[] args) {
		People obj = new People(); //obj引用People实例
		
		if (obj instanceof Object) {
			System.out.println("obj 是一个Object类");
		} 
		if (obj instanceof People) {
			System.out.println("obj 是一个属于人类");
		} 
		
	}

}
