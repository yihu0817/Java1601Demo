package com.scxh.java1601.object.innerclass1;
/**
 * 内部类访问外部类数据:
 *   1.静态内部类只能访问外部类静态数据
 *   2.非静态内部类直接访问外部类数据
 * 外部类访问内部类数据:
 * 
 * @author zhou.sir
 *
 */
public class Outer {

	private static int size;

	public static class Inner {
		
		public static int counnter;
		
		public void dostuff() {
			size++;
			System.out.println("size=" + size);
		}
	}

	public static void main(String[] args) {
//		Outer.Inner inner = new Outer.Inner();
		Inner inner = new Inner();
		inner.dostuff();

		
	}

}



