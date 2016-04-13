package com.scxh.java1601.object.innerclass2;

import com.scxh.java1601.object.practise02.IGame;

/**
 * 由于内部类可以直接访问其外部类的成员，因此当内部类与其外部类中存在同名属性或方法时，
 * 也将导致命名冲突。所以在多层调用时要指明，
 * 
 * @author zhou.sir
 *
 */
class Outer {
	private int size;

	public class Inner {
		private int size;

		public void dostuff(int size) {
			size++; // 局部变量 size;
			this.size = size; // 内部类的size
			Outer.this.size++; // 外部类的size
		}
	}
	
	public void test(){
		new IGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
}