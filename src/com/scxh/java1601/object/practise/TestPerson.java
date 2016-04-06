package com.scxh.java1601.object.practise;

public class TestPerson {

	public static void main(String[] args) {
		Person xiaoWang = new Person();  //构造对象小王
		/**
		 * 初始化相关属性
		 */
        xiaoWang.name = "小王";
        xiaoWang.weight = 70;
        xiaoWang.figure = '胖';
        
        /**
         * 调用方法
         */
        xiaoWang.loseWeight();
	}

}
