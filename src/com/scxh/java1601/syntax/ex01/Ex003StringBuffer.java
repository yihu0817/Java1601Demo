package com.scxh.java1601.syntax.ex01;

/**
 * StringBuffer和String都是用于操作字符串的类
 * 
 * String str = "hello"; // String str = new String("hello"); StringBuffer sb =
 * new StrinbBuffer("hello");
 *
 */
public class Ex003StringBuffer {

	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer("hello");
//		System.out.println(sb);
//		sb.append("world");
//		System.out.println(sb);
//		sb.append(13);
//		System.out.println(sb);
//
//		String str1 = sb.toString();
//
//		String str = "hello" + "world";
//		System.out.println(str);

		stringAndStringBuffer();
	}

	public static void stringAndStringBuffer() {
		String fragment = "abcdefghijklmnopqrstuvwxyz";
		int times = 10000;

		// 通过String对象
		System.out.println("String: 开始累加");
		long timeStart1 = System.currentTimeMillis(); //返回当前时间，单位毫秒minllis
		String str1 = "";
		for (int i = 0; i < times; i++) {
			str1 = str1 + fragment;
		}
		long timeEnd1 = System.currentTimeMillis();
		System.out.println("String: " + (timeEnd1 - timeStart1) + "ms");

		// 通过StringBuffer
		System.out.println("StringBuffer: 开始累加");
		long timeStart2 = System.currentTimeMillis();
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < times; i++) {
			str2.append(fragment);
		}
		long timeEnd2 = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (timeEnd2 - timeStart2) + "ms");
	}

}
