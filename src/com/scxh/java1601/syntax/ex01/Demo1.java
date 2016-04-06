package com.scxh.java1601.syntax.ex01;

/**
 * 方法传参问题，
 *   方法传递的是参数值而不是引用
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		int a = 5;
		
		demo.test(a);
		
		System.out.println("a :"+a);
		
	}
	
	public void test(int b){
		b = 8;
		System.out.println("b :"+ b);
	}

}
