package com.scxh.java1601.syntax;

/**
 * 1.标识符 
 * 2.java语言中标识符规则 
 *      1>组成 :字母，下划线，数字，美元符号
 *      2>不能以数字开头
 *      3>不能是保留字(保留字:java语言中被赋予了特定含义的单词) 
 * 3. 常量，变量(对应内存地址) 
 * 4. 基本数据类型
 *     byte short char int long float double  boolean 
 * 5. 变量声明 
 * 6. 赋值语句 
 * 7. 二进制，八进制，十进制 
 * 8. 单位 :位 字节 k M G 
 * 9. 一个汉字两个字节
 * 
 * 
		
数据类型 :整型
  byte
    字节 型       1字节 = 8位              0000 0011      1*2^0 + 1*2^1   = 3              -127   127               19                                                      
		                                   0000 0001    1                                                    11
										+  -------------                                            + --------
                                           0000 0100 	4   0*2^0 + 0*2^1 + 1*2^2			                 30 						
  short
     短整型      2字节 = 16位             0000 0000  0000 0000
  
   int
      整型	 4字节 = 32位             0000 0000  0000 0000  0000 0000  0000 0000
  
  long
    长整型      8字节 = 64位
-------------------------------------------------------------------------
单位  : 1G = 1014M    1M = 1024k  1k = 10124b  

 */
public class DataType {

	public static void main(String[] args) {
		intSyntax();
		floatSyntax();
	}
	
	/**
	 * 变量声明与赋值
	 */
	public static void otherSyntax(){
		int a; // 声明int变量a
		char b;
		boolean c;
		float d;
		double e;

		a = 1; // 将值1赋值给变量a
		b = 'a';
		c = true;
		d = 10.1f;
		e = 10.001d;
	}
	/**
	 * 整型变量声明与赋值
	 */
	public static void intSyntax(){
		byte g = 3;// 整型
		short x = 23; // 十进制
		int y = 023; // 八进制 3*8^0 + 2*8^1 19
		long z = 0x23; // 十六进制 3*16^0 + 2*16^1 35
		// 0000 0101 二进进制 1*2^0 + 0*2^1 + 1*2^2 =5
		System.out.println("转化成十进制：x = " + x + ", y = " + y + ", z = " + z);
	}
	
	/**
	 * 浮点型变量声明与赋值
	 */
	public static void floatSyntax(){
		float m = 22.45f;
		double n1 = 10;
		System.out.println("计算乘积：" + m + " * " + n1 + "=" + m * n1);
	}
	/**
	 * 字符型变量声明与赋值
	 */
	public static void charSyntax(){
		char webName1 = '极'; // 声明字符型变量webName1 ,将'极' 赋值给变量webName1
		char webName2 = '客';
		char webName3 = '之';
		char webName4 = '家';
		System.out.println("网站的名字是：" + webName1 + webName2 + webName3 + webName4);
	}
	/**
	 * 布尔型变量声明与赋值
	 */
	public static void booleanSyntax(){
		boolean i = true;
		boolean j = false;
		System.out.println("i :" + i + ", j :" + j);
	}
	/**
	 * 类型转换:  1.自动转换
	 *          2.强制转换
	 *     转换规则:  byte short char int long float double 
	 *                 按级别由低 - > 高
	 */
	public static void typeChange(){
		int a = (int) 34.56; // 强制类型转换
		System.out.println("a = " + a);

		int b = 24;
		float c = b; // 自动类型转换
		System.out.println("c = " + c);
	}

}
