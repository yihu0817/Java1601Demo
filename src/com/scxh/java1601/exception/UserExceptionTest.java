package com.scxh.java1601.exception;

/**
 * 实现两数相加，如果其中任何一个数为负，就抛出"数据为负异常"
 * 
 * @author zhou.sir
 *
 */
public class UserExceptionTest {

	public static void main(String[] args) {
		UserExceptionTest obj = new UserExceptionTest();
		int a = -12;
		int b = 23;
		try{
			int s = obj.add(a, b);
			System.out.println(a + " + " + b + " = " + s);
		
		}catch(UserException e){
		    System.out.println(e.getMessage());
		    e.printStackTrace();
		}
		
		System.out.println("程序结束");
	}

	public int add(int m, int n) throws UserException{
		if(m < 0 || n < 0){
			throw new UserException();
		}
		int sum = m + n;
		return sum;
	}

}
