package com.scxh.java1601.object.innerclass;

/**
 * 撑握知识点: 
 * 1.什么是内部类,怎么定义内部类 
 * 2.内部类可以访问外部类数据，包括私有数据 
 * 3.怎么实例化内部类？ 通过外部类对象实例化内部类：外部类对象.new 内部类名(); 
 * 4.内部类可以修改外部类数据
 * 
 * 撑握：成员为量、方法和类变量、方法(静态变量、方法)区别
 * 
 *  1.成员变量成员方法与具体对象有关
 *  2.静态变量、方法与类有类.
 * 
 * 
 *
 */
class Outer {
	private int size;
	
	public class Inner {
		private int counter = 10;

		public void doStuff() {
			size++; // 内部类可以访问外部类数据，包括私有数据
		}
	}

	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.size = 12;
		
		outer.testTheInner();
		
		Inner inner = outer.new Inner();

		System.out.println(inner.counter);

		System.out.println(outer.size);

		inner.doStuff();

		System.out.println(outer.size);

		// 编译错误，外部类不能访问内部类的变量
		// System.out.println(counter);
	}

	public void testTheInner() {
		Inner in = new Inner();
		in.doStuff();
	}

}
