package com.scxh.java1601.syntax.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex002Array {
	/**
	 * 存储5个学生成绩
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
//		int[] stuScores;   //声明数组
//		stuScores = new int[5];  //实例化数组
//		stuScores[0] = 89;
//		stuScores[1] = 79;
//		stuScores[2] = 99;
//		stuScores[3] = 86;
//		stuScores[4] = 100;
//		
//		System.out.println(stuScores[2]);
//		
//		String[] grades = new String[5];
//		grades[0] = "B";
//		grades[1] = "C";
//		grades[2] = "A";
//		grades[3] = "B";
//		grades[4] = "A";
//		
//		//定义一个数组按顺序存储1-100内的数字;
//		int[] array = new int[100];
////		array[0] = 1;
////		array[1] = 2;
////		 // .....
////		array[99] = 100;
//
//		//初始化数组
//		for(int i = 0; i < 100; i++){
//			array[i] = i+1;
//		}
//		
//		//打印数组元素
//		for(int i = 0; i < 100; i++){
//			System.out.println(array[i]);
//		}
//		
//	    //从键盘输入5个学生成绩存储到数组scores中;	
//		int[] scores = new int[5];
//        Scanner scaner = new Scanner(System.in);
//    
//        System.out.println("录入学生成绩开始");
//		for(int i = 0; i < 5; i++){
//			System.out.println("请输入学生成绩 :");
//			scores[i] = scaner.nextInt();
//		}
//		System.out.println("录入学生成绩结束！");
//		
//
//		for(int i = 0; i < 5; i++){
//			System.out.print(scores[i] + "  ");
//		}
		
		fib();
	}
	
	/**
	 * 利用数组来输出Fibonacci数列的前24项。
	 *  分析:  前两项为1, 后面每一项等于前两项之和
	 *   例如 :1  1  2  3  5  8  13 ......
	 */
	public static void fib(){
		int[] fib = new int[24];
		fib[0] = 1;
		fib[1] = 1;
		
		// i = 2,3,4......23
		//fib[i] = fib[i-2]+fib[i-1];
		
		int length = fib.length; //length为数组属性，求数组长度.
		for(int i = 2; i < length; i++){
			fib[i] = fib[i-2]+fib[i-1];
		}
		
		for(int j = 0; j < length; j++){
			System.out.print(fib[j] + "\t");
			if((j+1) % 4 == 0){
				System.out.println();
			}
			
		}
	}

}
