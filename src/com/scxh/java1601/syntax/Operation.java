package com.scxh.java1601.syntax;
/**
 * 运算符 :
 * 算术运算符   +  - * / % ++ -- +=  -=
 * 关系逻辑运算符    > <  >=  !=  ,  &&   ||  !   
 *             结果：boolean
 * 位运算        &   |   ^   ~ 
 * 三目运算符
 */
public class Operation {

	public static void main(String[] args) {
		arithmeticOperation();
		relationOperation();
	}
	/**
	 * 算术运算例1
	 */
	public static void arithmeticOperation(){
		int a = 1;
		int b = 2;
		int c = a + b;  // a+=b
		System.out.println("c = " + c);
		
		int d = a * b;
		System.out.println("d = "+d);
		
		
		int x = 2;
		int y = ++x; //  ++x <=>  (x = x+1;  y = x;)  ++在前表示 先加一再赋值
                     //	 x++ <=>  (y = x;  x = x+1;)  ++在后表示 先赋值再加一
		System.out.println("y = " + y);
		
		
		int n = 3;
		int m = --n;  // m = n--  <=>  m = n;  n = n - 1;
                      // m = --n  <=>  n = n - 1; m = n;		
		System.out.println("m = " + m);
		System.out.println("n = " + n);
	}
	/**
	 * 算术运算例2
	 */
	public static void arithmeticOperation1(){
		int a = 7;
		int b = 2;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		int g = a % b;
		
		System.out.println("c :" + c + " , d :" + d + " , e :" + e + " , f :"
				+ f + " , g :" + g);
		//++在变量前表示先加1再赋值       ,  ++a  a = 8;
		//++在变量后表示先赋值再加1   ,  a++  a = 7; a = 8
	
		System.out.println("a :"+ a++);  
		System.out.println("a :"+ a);  
	    System.out.println("b :"+ ++b);  
	    
	    int x = 5;
	    int y = x--;
	    System.out.println("y :"+y);
		
	    int h = 2;
	    int m = 3;
	    h-=m; 
//	    h = h + m;
	    System.out.println("h :"+h+ ", m :"+m);
	}
	/**
	 * 关系运算
	 */
	public static void relationOperation(){
		int a = 20;
		int b = 10;
		boolean f = a > b;
		System.out.println("f :" + f);
		
		boolean p = a != b;
		System.out.println("p :" + p);
	}
	/**
	 * 逻辑运算
	 */
	public static void logicOperation(){
		boolean g = true && false;     //逻辑与运算  只有同为true结果为true
		System.out.println("g :"+g);
		
		boolean j = false || false;     //逻辑或运算  只要有一个为true结果为true
		System.out.println("j :"+ j);
		
		boolean z = !true;
		System.out.println("z :"+ z);
	}
	/**
	 * 位运算
	 */
	public static void bitOperation(){
		/** 1 & 4     0000  0001
        && 0000  0100      0*2^0  +  0*2^1  + 1*2^2 = 4
		------------------------------------------
		           0000  0000      0
		           
		*/
		
		int abc = 1 & 4;
		System.out.println("abc = " + abc);
		
		
		/**
		2 | 5      第一步: 将操作数转化成二进制
		                  第二步: 二进制各位比较 只要有一个为1，那么结果就是1，否则就为0
		          2      0000  0010
					 5      0000  0101
				|	--------------------
		                 0000  0111      							
		*/
		
		int bcd = 2 | 5;
		System.out.println("bcd = " + bcd);
		
		/**
		~5        0000 0101
		   ~     -----------------
			        1111 1010       2+8+ 16 + 32 + 64 + 128 =   192  224   = 250       
					
					1000 0101   反码
					1000 0110   补码
						-6 
		*/
		int cda = ~5;
		System.out.println("cda = " + cda);
		
		/**
		 5-2  <=> 5 + (-2) 
		     0000 0101                   0000 0101
				1000 0010        1111 1101                                  取反
		   + ---------------
			                                1111 1110       取补
				-----------            --------------
		                                 0000 0011       3 
		
			             
			
		原码，反码，补码，
		  正数  【0 000  0001】原  = 【0000  0001】反 = 【0000  0001】补
		              负数  【1 000  0001】原
			 
		*/
		
		
		
		/** 
		十进制                    二进制                                 八进制                                        十六进制
		7     9                    0001                      1               int a = 05;      5*8^0 = 5 
		+ 1     1              +     0010                      2               int b = 023;     3*8^0 + 2*8^1 = 19             0-9 A B C D E F 
		--------------              -------------                              1000  0100 0010                      
		8	10                    0011     1*2^0 + 1*2^1 = 3            1   1 1 1 1 
		                                                                 16  8 4 2 1
		                                                                 1   0 0 1 1   1*2^0 + 1*2^1 + 0 + 0 + 1 *2^4 = 19 
		
		*/
		int a1 = 05;
		int b1 = 023;
		System.out.println("a1 = " + a1);
		System.out.println("b1 = " + b1);
		
		int k = 0xa1;   // 1*16^0 + a*16^1 = 161
		System.out.println("k = " + k);
		
		
		/**  int w = 3;            0000 0011
		                       	   
		 int z = w << 1;       0000 0110   -> 6
			        w >> 1;       0000 0001   -> 1
		==============================================
		 int w = -3;           1000 0011  -> 反码   1111 1100  ->补码 1111 1101 
		                       	   
		 int z = w << 1;       1111 1101    ->   1111 1010 -> 取反 1000 0101 ->   1000 0110   ->  -6
			                                                     
			        w >> 1;       
		
		*/
		
		int w = -3;
		int z = w << 1;
		System.out.println("z = " + z);
	}
	/**
	 * 位运算例2
	 */
	public static void bitOperationOne(){
		//与运算  : 各二进制位进行逻辑与运算
		int c = 7;        //0000 0111   
		int d = 2;        //0000 0010
		int e = c & d;//&&--------------
		              //    0000 0010
		System.out.println("e :"+ e);
		
		int f = c | d;// || 0000 0111
		System.out.println("f :"+ f);
		
		
		int g = ~c;   // 0000 0000 0000 0000 0000 0000 0000 0111
		              // 1111 1111 1111 1111 1111 1111 1111 1000
		              // 1000 0000 0000 0000 0000 0000 0000 0111
		              // 1000 0000 0000 0000 0000 0000 0000 1000
		              // -8
		
		
		System.out.println("g :"+ g);
	}
	/**
	 * 三目运算：
	 * 
	 * 表达式a?表达式b:表达式c
			 a    ?  b    :   c
			注: 1.表达式a的值必须是布尔值,
			    2.表达式b的值 和表达式c的值返回类型必须一至
	 */
	public static void threeOperation(){
	    int sum = 10;
	    boolean val = sum != 10? true : false;
	    System.out.println("val = "+ val);
	}

}
