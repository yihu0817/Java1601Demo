package com.scxh.java1601.syntax;

public class MethodOne {
    
	public static void main(String[] args) {
		MethodOne medthodOne = new MethodOne();
		medthodOne.print();
		
		
		int abc = 12;
		
		String ab = "极客之家1";
		String webName = new String("极客之家2");
		
		
		System.out.println(ab);
		System.out.println(webName);
	}
	/**
	 * 输出字符串信息
	 */
	public void print(){
		System.out.println("你好 hello world!");
	}
}
