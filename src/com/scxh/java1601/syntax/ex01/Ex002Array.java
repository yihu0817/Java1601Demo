package com.scxh.java1601.syntax.ex01;

import java.io.IOException;
import java.util.Scanner;

public class Ex002Array {
	/**
	 * 存储5个学生成绩
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {

//		fib();
		
//		arrayTwo();
		
//		arrayThree();
		
		int f = fib(5);
		System.out.println(f);
	}
	
	
	public static void arrayTwo(){
		int[]   b = new  int[3];     //一维数组b可以存储3个元素,每个元素是一个整数类型;
		int[][] a = new  int[3][4];  //二维数组a可以存储3个元素,每个元素表示一个长为4的数组;
		                            //二维数组a表示一个3行4列的矩阵
		
		
		//给二维数组赋值
		a[0][0] = 1;    a[0][1] = 2;    a[0][2] = 3;    a[0][3] = 4;
		a[1][0] = 11;   a[1][1] = 22;   a[1][2] = 33;   a[1][3] = 44;     
		a[2][0] = 111;  a[2][1] = 222;  a[2][2] = 333;  a[2][3] = 444;  
		
		//显示二维数组值
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 4; j++){
				int item = a[i][j];
				System.out.print(item + "\t");
			}
			System.out.println();
		}
	}
	
	public static void arrayThree(){
		int[]    b = {1,2,3,4}; //一维数组b存储4个元素,每个元素是一个整数
		int[][]  a = {{1,2,3},{3,4,5},{5,6,7},{7,8,9}}; //二维数组a存储4个元素,每个元素是一个长为3的数组
				
		int length1 = a.length;
		System.out.println(length1);
		
		int length2 = a[0].length;
		
		System.out.println(length2);
		
		/**
		 *      {1,2,3}  { a[0][0] , a[0][1], a[0][2] }
		 *      {3,4,5}  { a[1][0] , a[1][1], a[1][2] }
		 *      {5,6,7}  { a[2][0] , a[2][1], a[2][2] }
		 *      {7,8,9}  { a[3][0] , a[3][1], a[3][2] }
		 */
				
		//显示二维数组值
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				int item = a[i][j];
				System.out.print(item + "\t");
			}
			System.out.println();
		}
		
		
		/**
		 *   {1,2,3}  
			 {3,4,5} 
			 {5,6,7}
		 */
	}
	
	public static void arrayOne(){
		int[] stuScores;   //声明数组
		stuScores = new int[5];  //实例化数组
		stuScores[0] = 89;
		stuScores[1] = 79;
		stuScores[2] = 99;
		stuScores[3] = 86;
		stuScores[4] = 100;
		
		System.out.println(stuScores[2]);
		
		String[] grades = new String[5];
		grades[0] = "B";
		grades[1] = "C";
		grades[2] = "A";
		grades[3] = "B";
		grades[4] = "A";
		
		//定义一个数组按顺序存储1-100内的数字;
		int[] array = new int[100];
//		array[0] = 1;
//		array[1] = 2;
//		 // .....
//		array[99] = 100;

		//初始化数组
		for(int i = 0; i < 100; i++){
			array[i] = i+1;
		}
		
		//打印数组元素
		for(int i = 0; i < 100; i++){
			System.out.println(array[i]);
		}
		
	    //从键盘输入5个学生成绩存储到数组scores中;	
		int[] scores = new int[5];
        Scanner scaner = new Scanner(System.in);
    
        System.out.println("录入学生成绩开始");
		for(int i = 0; i < 5; i++){
			System.out.println("请输入学生成绩 :");
			scores[i] = scaner.nextInt();
		}
		System.out.println("录入学生成绩结束！");
		

		for(int i = 0; i < 5; i++){
			System.out.print(scores[i] + "  ");
		}
		
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

	/**
	 * 分析:      1      fib(1)        1
	 * @param n         fib(2)        1
	 *                  fib(3)        fib(1)+fib(2)
	 *                  fib(4)        fib(2)+fib(3)
	 *                        ..............
	 *                  fib(n)        fib(n-2)+fib(n-1)
	 *                  ========================================
	 *                  
	 *                                     fib(5) 
	 *                                     
	 *                        fib(3)          +           fib(4)
	 *          
	 *                     fib(1) + fib(2)           fib(2)  +      fib(3)    
	 *                       
	 *                                                          fib(1) + fib(2)
	 * @return
	 */
	public static int fib(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		
		return fib(n-2)+fib(n-1);      
		
	}
	/**
	 * 斐波纳契数列。前两个数都是1，第三个数是前两个数之和，以后的每个数都是其前两个数之和。
	 * 
	 * 1 1 2 3 5 8 .......  f1 f2 f3 f4 f5 f6 ..f10
	 * 
	 * f1 = f2 = 1;
	 * 
	 * f3 = f2+f1; f4 = f3+f2; ...
	 * 
	 * fn = fn-1 + fn-2;
	 * 
	 *
	 */
	public static void fibs(){
		int first = 1; // 前一个值
		int second = 1; // 后一个值
		int sum = first + second; // 当前值 = 前一个 + 后一个

		int i = 2;
		int n = 10;
//		while (i <= n) {
//			first = second;
//			second = sum;
//			sum = first + second;
//
//			++i;
//
//			System.out.println(sum);
//		}
		
		int k = 0;
		for(int j = 2; j <= n; j++){
			first = second;
			second = sum;
			sum = first + second;
			
			
			System.out.print(sum + "\t");
			if((++k) % 4 == 0){
				System.out.println();
			}
			
		}
	}

}
