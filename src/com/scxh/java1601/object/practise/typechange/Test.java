package com.scxh.java1601.object.practise.typechange;

/**
 * 包装类 
 * 引用类型数据均继承了Object 类的特性，要转换为String 类型（经常有这种需要）时只要简单调用Object
 * 类中定义的toString()即可.
 * 而基本数据类型转换为 String 类型则要麻烦得多。为解决此类问题
 * ，Java为每种基本数据类型分别设计了对应的类，称之为包装类(Wrapper Classes)，也有教材称为外覆类或数据类型类。
 * 
 * 1.是什么？为什么要引入包装类型？怎么用？
 * 
 * 练习: 定义一个整型变量m为 :int m = 578; 要求输出m的个位，十位，百位。
 *
 */
public class Test {

	public static void main(String[] args) {
		int m = 500;

		Integer a = m; // 自动装箱

		int n = a; // 自动拆箱

		Integer b = 500;

		System.out.println("a equal(b)是否相等 " + (a.equals(b)));
		System.out.println("a == b是否相等 " + (a == b));

		
		///
		
		String s = "500";
		int c = Integer.parseInt(s);
		int cc = c + 1;
		
		int k = 600;
		String kk = String.valueOf(k);
	}

	public void test1() {
		int m = 500;
		Integer a = new Integer(m); // 手动装箱

		String s = a.toString(); // s = "500";

		System.out.println(s);

		String c = "20";
		int n = a.intValue(); // 手机拆箱
		int b = n;

		System.out.println(b);
	}

}
