package com.scxh.java1601.syntax.test;

import java.util.Scanner;

public class MethodFunction {
	public static void main(String args[]) {
		// sumHun();
		// String str = "helloWorld";
		// print(str); //调用方法

		// String s = null;
		// s = getGradeByScore();
		// System.out.println(s);

		int m = 0;
		m = maxMethod(30, 50);
		System.out.println(m);
	}

	/**
	 * 求 1+2+3+4+5+....99+100的和
	 */
	public static void sumHun() {
		int sum = 0; // 总和
		int item = 0; // 某一项值
		for (int i = 1; i <= 100; i++) {
			item = item + 1;
			sum = sum + item;
		}
		System.out.println("1+2+3+4+5+....99+100的和是 :" + sum);
	}

	/**
	 * 定义方法
	 * 
	 * 要求控制台输出 msg 内容
	 * 
	 * @param msg
	 */
	public static void print(String msg) {
		System.out.println(msg);
	}

	/**
	 * 控制台 输入百分成绩，返回成绩等级，成绩>=90 输出A, 80<=成绩<90输出B, 70<=成绩<80输出C , 成绩<70输出D。
	 * 
	 * @return
	 */
	public static String getGradeByScore() {
		Scanner scanner = new Scanner(System.in); // 实例一个类Scanner
		int score = scanner.nextInt(); // 获取键盘输入成绩
		char grade; // 等级

		int core = score / 10;

		switch (core) {
		case 10:
		case 9:
			grade = 'A';
			break;

		case 8:
			grade = 'B';
			break;

		case 7:
			grade = 'C';
			break;

		default:
			grade = 'D';
		}

		String str = score + "分 学生等级是 :" + grade;

		return str;
	}

	/**
	 * 返回两个数 a ,b 最大值
	 * 
	 * @param a
	 * @param b
	 * @return
	 */

	public static int maxMethod(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}

		return max;

	}
}
