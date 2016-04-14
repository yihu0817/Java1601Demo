package com.scxh.java1601.object.innerclass;
/**
 * 匿名内部类 
 * 1.定义位置, 方法体类或语句块内
 * 2.匿名类必须继承一个父类或实现一个接口
 * 
 * @author zhou.sir
 *
 */
public class Demo {

	public static void main(String[] args) {
		Person p = new Child();
		p.eat();
		
		Person p1 = new Person() {
			@Override
			public void eat() {
				System.out.println("eat something");
			}
		};
		p1.eat();
		
		/**
		 * 实例化一个匿名内部类 
		 */
		
		new Person() {
			@Override
			public void eat() {
				System.out.println("eat something");
			}
		}.eat();
	}
}
