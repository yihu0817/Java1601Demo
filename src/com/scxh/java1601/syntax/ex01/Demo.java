package com.scxh.java1601.syntax.ex01;
/**
 * 方法重载:
 * 
 * 方法名称相同，参数列表不同
 *  参数列表不同： 参数个数不同， 
 *             参数顺序不同,
 *             参数类型不同,
 *             
 * 注:方法重载和返回值类型、访问修饰符无关.
 *   类方法(静态方法)： static关键字修饰的访问
 *   类方法修饰的方法不能重载.
 *   
 *   实参，形参 （作用域）
 *   
 *   方法传递参数， 传递的是参数值，还是参数的引用.
 *
 */
public class Demo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.test("测试2");
		
		int a1 = 12;
		String b1 = "测试3";
		
		demo.test(a1,b1);
	}

	public void test(){
		System.out.println("测试 1");
	}
	
	public void test(String msg){
		System.out.println(msg);
	}
	
	 /**
	  * 实参
	  * 形参 作用域
	  * @param a
	  * @param b
	  */
	public void test(int a, String b){
		a = 21;
		b = " ";
	}
	public void test(String msg,int a){
		
	}
}
