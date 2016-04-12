package com.scxh.java1601.object.practise.extend;

/**
 * Object类 equals方法 equals ：比较两个对象是否相同， 只能用于比较对象 == : 基本数据类型比较两个值是否相等，
 * 对象比较是指比较引用地址即对象所在内存地址是否相同
 *
 */
public class TestObjectMethod {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile();
		mobile1.name = "三星手机";

		Mobile mobile2 = new Mobile();
		mobile2.name = "三星手机";

		if (mobile1.equals(mobile2)) {
			System.out.println("手机是相同的手机");
		}else{
			System.out.println("手机不是同一个手机");
		}
		

	}

	public void testTeacher() {
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();

		if (t1.equals(t2)) {
			System.out.println("t1 与t2 是同一个对象");
		} else {
			System.out.println("t1 与t2 不 是同一个对象");
		}

		int a = 2;
		int b = 2;

		if (a == b) {
			System.out.println("a 与b 值相同");
		} else {
			System.out.println("a 与b 值不相同");
		}

		if (t1 == t2) {
			System.out.println("两个对象引用地址相同");
		} else {
			System.out.println("两个对象引用地址不相同");

		}
	}

}
