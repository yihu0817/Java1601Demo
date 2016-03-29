package com.scxh.java1601.syntax.ex01;
/**
 *    java数据类型：  基本数据类型
                                              类类型
                             
 *  1.String  字符串类型
 *    String str = "it.warmtel.com";
 *    String str = new String("it.warmtel.com");
 *  
 *  2.String常用方法 
 *     s.startWith(s1)  endWith()  indexOf charAt    replace  substring  splite  length
 *     
 *  3. 字符串连接符 "+"
 *     String str = "hello";
 *     str = str + "world";   //str = "helloworld"
 *     
 *  4. 类方法和对象方法
 * 
 *
 */
public class Ex001String {

	public static void main(String[] args) {
		String str = "www.warmtel.com!";
		
		Ex001String ex001 = new Ex001String();
		boolean flag = ex001.startWiths(str, "www");
		System.out.println(flag);

		int index = ex001.indexOfs(str, "war");
		System.out.println(index);
	}

	public boolean endsWiths(String s, String over) {
		boolean end = s.endsWith(over);
		return end;
	}

	public boolean startWiths(String s, String head) {
		boolean start = s.startsWith(head);
		return start;
	}

	public int indexOfs(String s, String sub) {
		int index = s.indexOf(sub);
		return index;
	}

	public String replaces(String s, String olds, String news) {
		String ns = s.replace(olds, news);
		return ns;
	}

	public char charAts(String s, int index) {
		char c = s.charAt(index);
		return c;
	}

	public int lengths(String s) {
		int length = s.length();
		return length;
	}

	/**
	 * 字符串连接符 " + "
	 */
	public void strContact() {
		String stuName = "小明A1";
		int stuAge = 17;
		float stuScore = 92.5f;

		String info = stuName + "的年龄是 " + stuAge + "，成绩是 " + stuScore;

		System.out.println(info);
	}
}
