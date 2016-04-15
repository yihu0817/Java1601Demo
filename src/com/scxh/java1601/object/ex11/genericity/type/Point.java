package com.scxh.java1601.object.ex11.genericity.type;
/**
 * 定义泛型类Point
 * @author zhou.sir
 *
 * 泛型类: 类名后指定泛型参数, 泛型参数用尖括号括起来<>尖括号内指定泛型类型列表   
 *       如指定的泛型类型T1,T2 就可以在类体里使用.  
 *
 * @param <T1>
 * @param <T2>
 */
public class Point<T1,T2> {
	T1 x;
	T2 y;
	
	public T1 getX() {
		return x;
	}

	public void setX(T1 x) {
		this.x = x;
	}

	public T2 getY() {
		return y;
	}

	public void setY(T2 y) {
		this.y = y;
	}
	/**
	 * 泛型方法定义
	 * 在修饰符与返回值类型之间定义方法中使用的泛型类型
	 * 
	 * 
	 * @param x
	 * @param y
	 */
	public <V1,V2> void printPoint(V1 x ,V2 y){
		V1 a = x;
		V2 b = y;
		System.out.println("This point is：" + a + ", " + b);
		
	}
	
	public void print(Point<?, ?> p){
		System.out.println("This point is：" + p.getX() + ", " + p.getY());
	}
}
