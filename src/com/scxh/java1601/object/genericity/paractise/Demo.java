package com.scxh.java1601.object.genericity.paractise;
/**
 * 1.定义一个方法，求最大值。
 *   public double getMax(double x,double y){
 *      
 *   }
 *   
 *   x = 12.2, y=23.0   Double
 *   x = 20,   y=49     Integer
 *                        
 *                      Number类  子类
 *   AtomicInteger, AtomicLong, BigDecimal, BigInteger,
 *    Byte, Double, Float, Integer, Long, Short 
 *   
 * 
 *   x = "abc" y="dfdf"
 * 
 * 
 *    练习：
 *   编写一个泛型函数用于返回不同类型数组（Integer 数组、Double 数组、Long 数组等）中的最大值
 * 
 *
 */
public class Demo {

	public static void main(String[] args) {
//		Float a = 23f;
//		Float b = 45f;
		
		Long a = 34l;
		Long b = 66l;
		
		Demo demo = new Demo();
		double max = demo.getMax(a,b);
		System.out.println("最大值是 "+max);
	}

	public <T1 extends Number> double getMax(T1 x,T1 y){
		return x.doubleValue() > y.doubleValue()? x.doubleValue():y.doubleValue();
	}
	
}
