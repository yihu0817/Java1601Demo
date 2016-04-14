package com.scxh.java1601.exception;

/**
 * 1.系统抛异常方式: 异常发生 -> 检查有无捕获异常代码 ->有 -> 直接处理 ->无-> 将异常抛给方法调用处 - >检查有无捕获异常代码 ->有
 * -> 直接处理 ->无-> 将异常抛给方法调用处 - >检查有无捕获异常代码 ->有 -> 直接处理
 * 
 * 2.人为抛异常：   throw 标准异常对象
 * 
 * @author zhou.sir
 *
 */
public class ThrowDemo {

	public static void main(String[] args) throws ArithmeticException,ArrayIndexOutOfBoundsException {
		ThrowDemo demo = new ThrowDemo();
		
		demo.testThrows();
	}

	public void testThrows() {
		int a = 4;
		int b = 0;
		int c[] = { 1, 2, 3, 4, 5 };

		test2(a,b);
	
		System.out.println("end");
	}
	
	public void test2(int a,int b)  {
		System.out.println(a / b);
		
		if(b == 0){
			throw new ArithmeticException();
		}
	}

}
