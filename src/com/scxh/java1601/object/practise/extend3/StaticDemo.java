package com.scxh.java1601.object.practise.extend3;

public class StaticDemo {
	static int i = 20;
	int j = 0;
	
	public static void main(String[] args) {
		StaticDemo obj1 = new StaticDemo();
		obj1.i = 10;
		obj1.j = 10;

		StaticDemo obj2 = new StaticDemo();

		System.out.println("obj1.i=" + obj1.i + ", obj1.j=" + obj1.j);
		System.out.println("obj2.i=" + obj2.i + ", obj2.j=" + obj2.j);
	}

	public void show() {
		int a = 12;
		System.out.println("成员方法 show() ");
	}
	
	public static void say() {
		i = 11;
		
		System.out.println("静态方法 say() ");
	}

}
