package com.scxh.java1601.object.ex01;

public class TestEmployee {

	public static void main(String[] args) {
		Employee zhangEmoloyee = new Employee("张三", 24, 4000);
		Employee liEmoloyee = new Employee("李四", 34, 4500);

		zhangEmoloyee.showName();
		liEmoloyee.showName();
	}

}
