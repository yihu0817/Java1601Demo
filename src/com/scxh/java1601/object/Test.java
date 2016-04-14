package com.scxh.java1601.object;


/**
 * 抛异常 : 1.程序运行出错 2.异常与系统中预定义某个异常类相对应 3.系统自动产生一个该异常类的对象 4.向外抛出该异常类对象
 * 
 * if(没有处理异常的代码){ 
 * 	  Java运行系统处理异常,首先显示描述异常信息的字符串，然后终止程序的运行。 
 * } 
 * if(有处理异常的代码){
 *    异常对象交给该段代码进行处理
 * }
 * 
 * 
 * 
 * @author zhou.sir
 *
 */
public class Test {

	public static void main(String[] args) {
		Test test = new Test();
//		Point point = test.new Point(120,30);
		Point point = null;
		/**
		 * NullPointerException 空指针异常
		 * 当一个对象没有实例化为null时，去调用了对象的方法或者属性
		 */
		
		try{
			
			test.print(point);
			
		}catch(NullPointerException e){
			System.out.println("空指针异常 :"+e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void print(Point point){
		String s = point.toString();
		System.out.println(s);
	}
	
	public class Point{
		private int x;
		private int y;
		
		public Point(int x,int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public String toString() {
			return "坐标 [x=" + x + ", y=" + y + "]";
		}
	}
	
	public void testException(){
		try {
			/**
			 * 可能发生异常代码块
			 */
			int num[] = new int[2];
			num[1] = 23; // ArrayIndexOutOfBoundsException obj = new  ArrayIndexOutOfBoundsException();
			int b = 0;
			int a = num[1] / b;
			System.out.println("a " + a);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			String error = e.getMessage();
			System.out.println("数组下标越界异常处理 "+ error);
			
			e.printStackTrace();
			
		} catch(ArithmeticException a){
			
			System.out.println("数组下标越界异常处理 "+ a.getMessage());
			a.printStackTrace();
			
		}
	}
	
}
