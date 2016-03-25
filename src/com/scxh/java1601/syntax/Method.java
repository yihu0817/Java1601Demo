package com.scxh.java1601.syntax;

import java.util.Scanner;

/**
 *  学习方法调用有返回值情况 
 *
 */
public class Method {
	
	public static void main(String[] args) {
		System.out.println("方法调用开始");
		
		boolean flag = true; //循环条件
		while(flag){
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要判断的水仙花数 :");
			int score = scanner.nextInt();
			
			boolean isFlow = printFlow(score);
			if(isFlow == true){
				System.out.println(score+" 是水仙花数");
				flag = false;
			}else{
				System.out.println(score+" 不是水仙花数");
				flag = true;
			}
		}
		
		
//		char grade = scoreIf(score);
//		System.out.println("成绩是" + score + "分 等级是" + grade);
	}

	public static int max(int aa,int bb){
		int a = aa;
		int b = bb;
		int m;
		if(a > b){
			m = a;
		}else{
			m = b;
		}
		return m;
		
	}
	
	/**
	 * 输入百分成绩，输出成绩等级，成绩>=90 输出A, 80<=成绩<90输出B, 70<=成绩<80输出C , 成绩<70输出D。
	 */
	public static char scoreIf(int s) {
		int score = s;
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80 && score < 90) {
			grade = 'B';
		} else if (score >= 70 && score < 80) {
			grade = 'C';
		} else {
			grade = 'D';
		}

		return grade;

	}
	/**
	 * 判断输入的变量n是否是水仙花,返回结果true 表示是水仙花，flase 表示不是水仙花
	 * @param n
	 * @return
	 */
	public static boolean printFlow(int n){
		boolean flag = false; //flag :true 表示是水仙花，flase 表示不是水仙花
		int number = n; //371
		int one;
		int ten;
		int hun;
		
		one = number % 10;
		ten = (number % 100) / 10;
		hun = number / 100;
		
		
		if(one*one*one + ten*ten*ten + hun*hun*hun  == number){
			flag = true;
		}else{
			flag = false;
		}
		
		return flag;
		
	}


}
