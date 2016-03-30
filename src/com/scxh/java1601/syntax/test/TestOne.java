package com.scxh.java1601.syntax.test;

public class TestOne {

	public static void main(String[] args) {
		System.out.println("调用方法开始");
		
		primeNumber();
		
		printStar();
		
		printDiamod();
		
		printFlow();
		
		System.out.println("调用方法结束");
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
	/**
	 * 求100以内的质数(素数) 
	 * 质数的定义：只能被1或自身整除的数 <=> 除了1和自身外还可以被其它数整除的数不是质数
	 * 
	 * 分析: number % xx == 0 ;  4 % 1 , 4 % 2 , 4 % 3 , 4 % 4 , 4 % 5
	 */
	public static void primeNumber() {
		for (int i = 2; i <= 5; i++) {
			int number = i;
            boolean flag = true; //true表示是质数， false 不是质数
            
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag == false){  //当前number不是质数
				continue;
			}
			
			System.out.print(number+",");
		}
		System.out.println();
	}
	/**
	 * 编程显示以下图形（共N 行，N 由键盘输入）。
	 *	           *
	 *	         * * *
	 *	       * * * * *
	 *	     * * * * * * *
	 *	   * * * * * * * * *
	 *
	 * 分析:     行                空格                  星
	 *     i    1        4        1
	 *          2        3        3 
	 *          3        2        5
	 *          4        1        7 
	 *          5        0        9 
	 *          ..       ..       ..
	 *          
	 *          n       n-i       2i-1         
	 *          
	 *          
	 */
	public static void printStar(){
		int n = 5;  //n表示三角星行数
		
		for(int i = 1; i <= n; i++){  // i = 1    
			for(int j = 1; j <= n-i; j++ ){ // j=1,2,3,4,5  ;  n-i= 4   
				System.out.print(" ");
			}
			
			for(int k = 1; k <=2*i-1; k++){ //2*i-1 = 3; k=1,2,3
				System.out.print("*");
			}
            
			System.out.println();
		}
		
	}
	/**
	 * 5.编程显示以下图形（共N 行，N 由键盘输入）。
		           *
		         * * *
		       * * * * *
		     * * * * * * *
		   * * * * * * * * *
		     * * * * * * *
		       * * * * *
		         * * *
		           *
		 分析:下三角形
		              行            空格         星
		  i   1      1     7 
		      2      2     5
		      3      3     3
		      4      4     1
		 n:4
		 n:midle      
		             i    2*(midle -i) + 1 
    
	 */
	public static void printDiamod(){
		int n = 10;
		int midle = (n+1)/2; //上面三角形行数
		
		//打印上三角形
		for(int i = 1; i <= midle; i++){   
			for(int j = 1; j <= midle-i; j++ ){   
				System.out.print(" ");
			}
			for(int k = 1; k <=2*i-1; k++){ 
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//打印下三角形
		midle = midle-1;  //下面倒三角形行数 
		for(int i = 1; i <= midle; i++){
			for(int j = 1; j <= i; j++){  
				System.out.print(" ");
			}
			for(int k = 1; k<=2*(midle -i) + 1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	/**
	 * 求水仙花数
		水仙花数的定义：
		   水仙花数是三位数，它的个、十、百位数字的立方的和等于该数本身， 
		  例如：371=27+343+1
	      分析:	  
		
	 */
	public static void printFlow(){
		int number = 371;
		int one;
		int ten;
		int hun;
		
		one = number % 10;
		ten = (number % 100) / 10;
		hun = number / 100;
		
		
		if(one*one*one + ten*ten*ten + hun*hun*hun  == number){
			System.out.println(number+ "是水仙花数");
		}else{
			System.out.println(number+ "不是水仙花数");
		}
		
		
	}
	
}
