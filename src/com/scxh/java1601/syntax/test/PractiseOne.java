package com.scxh.java1601.syntax.test;

import java.util.Scanner;

/**
 * 编程练习1
 *
 */
public class PractiseOne {

	public static void main(String[] args) {
		double max = maxOne();
		System.out.println("最大值是 :" + max);
	}

	/**
	 * 最大值例1
	 */
	public static double maxOne() {
		double a = 30.03;
		int b = 40;
		double max; // 放最大值

		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
		
	}

	/**
	 * 最大值例2
	 */

	public static void maxTwo() {
		double a = 30.03;
		int b = 40;
		double max = a;

		if (max < b) {
			max = b;
		}
		System.out.println("最大值是 :" + max);
	}

	/**
	 * 判断公元1988年是否为闰年? (可被4整除（但不可被100整除）为闰年,年数可以被400整除的也是闰年)
	 *
	 * 分析： ((year % 4 == 0) && (year % 100 !=0) ) || (year % 400 == 0)
	 */

	public static void leapYear() {
		int year = 2006;

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			System.out.println(year + "年 是闰年");

		} else {

			System.out.println(year + "年 不是闰年");

		}
	}

	/**
	 * 检查用random()方法产生的一个字符，判断是否为英文大写字母、小写字母、数字或是其他符号，并输出相应信息。
	 * 
	 * 大写字母 'A' -'Z' 小写字母 'a' - 'z' 数字 '0' - '9' 其它 字符
	 */
	public static void randomChar() {
		double number = Math.random(); // 产生一个0.0 - 1.0之间的随机数
		char randomChar = (char) (number * 128);

		if ('A' <= randomChar && randomChar <= 'Z') { // 判断是否大写字母

			System.out.println(randomChar + " 是大写字母");

		} else if ('a' <= randomChar && randomChar <= 'z') { // 判断是否小字字母

			System.out.println(randomChar + " 是小写字母");

		} else if ('0' <= randomChar && randomChar <= '9') { // 判断是否数字字符

			System.out.println(randomChar + " 是数字");

		} else {

			System.out.println(randomChar + " 是其它字符");
		}
	}

	/**
	 * 输入百分成绩，输出成绩等级，成绩>=90 输出A, 80<=成绩<90输出B, 70<=成绩<80输出C , 成绩<70输出D。
	 */
	public static void scoreIf() {
		char grade;

		// String str = args[0];
		// int score = Integer.parseInt(str);

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 80) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		System.out.println("成绩是" + score + "分 等级是" + grade);
	}

	/**
	 * 四、输入百分成绩，输出成绩等级，成绩>=90 输出A, 80<=成绩<90输出B, 70<=成绩<80输出C , 成绩<70输出D。
	 * 
	 * 根据switch(表达式)值 去匹配case值，如果找到则执行，如果没有匹配值则执行default 语句
	 * 执行匹配到case语句后，如果有break语句则跳出switch语句，如果没有break语句则顺序向下执行，下一个case语句
	 * 
	 * 分析:95/10=9 98/10=9 90/10=9 88/10=8 87/10=8 76/10=7
	 */
	public static void scoreSwitch() {
		Scanner scanner = new Scanner(System.in); // 实例一个类Scanner
		int score = scanner.nextInt(); // 获取键盘输入成绩
		char grade; // 等级

		int core = score / 10; 

		System.out.println("core :" + core);
		switch (core) {
		case 10:
		case 9:
			grade = 'A';
			System.out.println("a");
			break;

		case 8:
			grade = 'B';
			System.out.println("b");
			break;

		case 7:
			grade = 'C';
			System.out.println("c");
			break;

		default:
			grade = 'D';
			System.out.println("d");
		}

		System.out.println(score + "分 学生等级是 :" + grade);
	}
	/**
	 * 输出1～100内可以被3整除的前5个数。
	 */
	public static void exactDivision(){
		int count = 0; //计数
		int i = 0;
		while (i < 100) {
			++i;

			if (i % 3 == 0) {
				++count;   
				
//				if(count <= 5){
//					System.out.println("前5个可以被3整除 :" + i);
//				}
				
				System.out.println("所有 可以被3整除 :" + i);
				
				if(count == 5){
					break;
				}
			}
		}
	}
	/**
	 * 输出1～100内可以被3整除的前5个数。
	 */
	public static void exactDivisionTwo(){
		int count = 0;
		int i = 0;
		
		while (i < 100) {
			++i;
			
			if (i % 3 != 0) {  //检查 i 是否能被3整除，不能被3整除则结束本次循环。
				continue;
			}
			
			System.out.println("i :" + i);
			
			++count;   //统计能被3整除的数的个数
			if(count == 5){
				break;
			}
		}
	}
	/**
	 * 百元买百鸡:用100钱买100只鸡。已知公鸡5元/只,母鸡3元/只,小鸡1元/3只。 分析： 这是个不定方程——三元一次方程组问题（三个变量，两个方程）
	 * x＋y＋z=100 5x＋3y＋z/3=100 设公鸡为x只，母鸡为y只，小鸡为z只。
	 */
	public static void buyChickenOne(){
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				for (int z = 0; z <= 100; z++) {
					if ((x + y + z == 100) && (5 * x + 3 * y + z / 3.0 == 100)
							&& (z % 3 == 0)) {

						System.out.println("公鸡 :" + x + "只," + " 母鸡  :" + y
								+ " 只," + " 小鸡 :" + z);
					}
				}
			}
		}

	}
	public static void buyChickenTwo(){
		for (int x = 0; x <= 100; x++) {
			for (int y = 0; y <= 100; y++) {
				int z = 100 - x - y;
				if (5 * x + 3 * y + z / 3.0 == 100) {
					System.out.println("公鸡 :" + x + "只," + " 母鸡  :" + y + " 只,"
							+ " 小鸡 :" + z);
				}
			}
		}
	}
	/**
	 * 斐波纳契数列。前两个数都是1，第三个数是前两个数之和，以后的每个数都是其前两个数之和。
	 * 
	 * 1 1 2 3 5 8 ....... f1 f2 f3 f4 f5 f6 f100
	 * 
	 * f1 = f2 = 1;
	 * 
	 * f3 = f2+f1; f4 = f3+f2; ...
	 * 
	 * fn = fn-1 + fn-2;
	 * 
	 *
	 */
	public static void fib(){
		int first = 1; // 前一个值
		int second = 1; // 后一个值
		int sum = first + second; // 当前值 = 前一个 + 后一个

		int i = 2;
		int n = 10;
		while (i <= n) {
			first = second;
			second = sum;
			sum = first + second;

			++i;

			System.out.println(sum);
		}
	}
}
