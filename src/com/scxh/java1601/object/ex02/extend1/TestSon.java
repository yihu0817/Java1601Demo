package com.scxh.java1601.object.ex02.extend1;

/**
 * 测试儿子继承父亲
 * 
 * @author zhou.sir
 *
 */
public class TestSon {

	public static void main(String[] args) {
		TestSon test = new TestSon();
		test.test();
	}
	
	public void test(){
		Father father = new Father();
		father.runCompany();
		
		Son son = new Son();
		son.runCompany();
		son.playGame();
	}

	

}
