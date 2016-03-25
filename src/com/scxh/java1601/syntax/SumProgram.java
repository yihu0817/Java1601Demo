package com.scxh.java1601.syntax;

import java.util.Scanner;

/**
 * 
 * 程序设计方法 : 递推法 (累加)
 */
public class SumProgram {

	public static void main(String[] args) {
		// sumOne();
		// sumTwo();
		// sumThree();
		// getValueFromkeyboard();
		// printMessage();
	}

	/**
	 * 定义方法 求 1+2+3+4+5+....99+100的和
	 */
	public static void sumOne() {
		int sum = 0; // 总和
		int item = 0; // 某一项值
		for (int i = 1; i <= 100; i++) {
			item = item + 1;
			sum = sum + item;
		}
		System.out.println("1+2+3+4+5+....99+100的和是 :" + sum);
	}

	/**
	 * 求 1-1/2+1/3-1/4 + ....+1/99-1/100 的和
	 */
	public static void sumTwo() {
		int sum = 0; // 总和
		int item = 0; // 某一项值
		int q = -1;
		for (int i = 1; i <= 100; i++) {
			q = -q;
			item = q / (item + 1);
			sum = sum + item;
		}
		System.out.println("1-1/2 +1/3-1/4 + ....+1/99-1/100的和是 :" + sum);
	}

	/**
	 * 求3+33+333+3333+33333的和
	 */
	public static void sumThree() {
		int sum = 0; // 总和
		int item = 0; // 某一项
		for (int i = 1; i <= 5; i++) {
			item = item * 10 + 3;
			sum = sum + item;
		}
		System.out.println("3+33+333+3333+33333的和是 :" + sum);
	}

	/**
	 * 获取从键盘输入的值
	 */
	public static void getValueFromkeyboard() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入值 :");
		int value = scanner.nextInt();
		System.out.println("您输入的值是 :" + value);
	}

	/**
	 * 打印累加结果信息 a + aa + aaa + ... + aa..aa = sum
	 */
	public static void printMessage() {
		int sum = 1000;
		int n = 8;
		int a = 3;
		int it = 0;
		for (int j = 1; j <= n; j++) {
			it = it * 10 + a;
			System.out.print(it);

			if (j != n)
				System.out.print("+");

		}

		System.out.print(" = " + sum);
	}

}
