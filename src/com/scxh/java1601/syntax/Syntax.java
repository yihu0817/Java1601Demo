package com.scxh.java1601.syntax;

/**
 *  一.复习巩固编程基础知识
 *   1.语句
 *     顺序结构:  1.变量声明 : 数据类型 变量名;   数据类型 变量1,变量2;  
 *              2.赋值语句:  变量  = 表达式值;   变量1 = 变量2 = 表达式值;
 *              3.自增，自减 :  ++ ， --
 *              4.标准输出语句: System.out.println();
 *              5.方法调用语句:  方法名();
 *              6.new 语句
 *              7.空语句 :  ;
 *              
 *     选择结构：    1.分支语句   : if语句       
 *                                 if(表达式){   
 *                                    语句块 
 *                                 }
 *                                 
 *                         if-else语句   
 *                                 if(表达式){   
 *                                    语句块1;
 *                                 }else{
 *                                    语句块2;
 *                                 }
 *                                 
 *                        if-else-if语句   
 *                                 if(表达式1){   
 *                                    语句块1;
 *                                 }else if(表达式2){
 *                                    语句块2;
 *                                 }
 *                                 
 *                多分支语句: switch(表达式){
 *                            case 值1 :
 *                                语句块1;
 *                                [break;]
 *                            case 值2 :
 *                            	     语句块2;
 *                            
 *                            case 值3 :
 *                            	     语句块3;
 *                            
 *                            default :
 *                                语句块4;
 *                          }
 *                        
 *               
 *     循环结构
 *               循环语句:
 *                       while(表式示){
 *                           //循环体
 *                       }
 *                       
 *                       do{
 *                           //循环体
 *                       }while(表式示)
 *                        
 *                       for(设定初始值;条件判断;改变条件){
 *                            //循环体
 *                       }
 *                       
 *                       
 *     跳转语句 :              break;
 *                          continue;
 *                          return;   return 表达式值;
 */
public class Syntax {

	public static void main(String[] args) {
//		ifSyntax();
		whileSyntax();
	}
	/**
	 * if条件语句
	 */
	public static void ifSyntax(){
		int a = 2; // 将整数2赋值给整型变量a
		a = 1 + 2;
		
		// ========IF 语句==========
		if (a > 3) {
			System.out.println("a>3");
		}
		
		
		//======== if else 语句 ============
		if (a > 3) {
			System.out.println("a>3");
		} else {
			System.out.println("a <= 3");
		}

		System.out.print("ok!");
		// /////////////////////////////////////////

		//========== if elase if 语句 ==========
		int b = 10;
		if (b == 11) {
			b = b + 1;
		} else if (b == 10) {
			b = b - 1;
		} else if (b == 9) {
			b = 8;
		}
		System.out.println("b = " + b);
		// ////////////////////////////

		int c = 8;  // a=3,b=9

		
		//========== IF嵌套语句 ===========
		if (c > 9) {
			if (b == 10) {
				b = b - 1;
			}
		} else {
			if (a == 3) {
				a = a + 1;
			} else {
				a = a - 1;
			}
		}
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
	/**
	 * switch语句
	 */
    public static void switchSyntax(){
    	int a = 3;
		
		switch(a){
		case 1 :
			System.out.println("分支1语句块");
			
		case 2 :
			System.out.println("分支2语句块");
		
		case 3 :
			System.out.println("分支3语句块");
			
		default :
			System.out.println("default语句块");
		}
		
		System.out.println("switch分支语句结束");
    }
    /**
     * while循环语句
     */
    public static void whileSyntax(){
    	
    	int i = 0;
		boolean flag = true;
		while (flag) {
			i++;  //i = i + 1;

			System.out.println(i);

			if (i == 5) {
				flag = false;
			}
		}

		System.out.println("循环结束！");

    }
    /**
     * do-while语句
     */
    public static void doWhileSyntax(){
    	int i = 0;
		boolean flag = false;
		do{
			i = i + 1;
			System.out.println("i :"+i);
		}while(flag);
		
		
		/*while(flag){
			i = i + 1;
			System.out.println("i :"+i);
		}*/
    }
    /**
     * for循环
     */
    public static void forSyntax(){
    	int sum=0;
		for (int i = 1; i <= 10; i = i + 1) { 
            sum = sum + i;	//i:1,2,3,4,5,6;  sum:1,3,6,10,15,21
            if(i==6){
            	break;
            }
		}
		System.out.println("sum:" + sum);  //21
    }
    /**
     * 跳转语句 continue break 
     */
    public static void continueSyntax(){
    	int sum = 0;
		System.out.print("sum " + sum);
		
		if (sum == 0) {
			return;
		}
		
		for (int i = 1; i <= 5; i = i + 1) {
			if (i == 2) {
				continue;
			}
			sum = sum + i;// sum=1,4,8,13
			System.out.print(" " + i); // i=1,3,4,5
		}

		System.out.println(" sum :" + sum); // 13
    }
    /**
     * return语句
     */
    public static void returnSyntax(){
    	int a = 2;
		//方法体
		if(a == 1){
		   return;
		}
		
		int b = 3;
		b++;	
    }
}
