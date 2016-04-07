package com.scxh.java1601.object.practise.extend1;

public class Test {

	public static void main(String[] args) {
		Dog myDog = new Dog("花花");
		myDog.say(); // 子类的实例调用子类中的方法
		myDog.say("重载");
		
//		Animal myAnmial = new Animal("贝贝");
//		myAnmial.say(); // 父类的实例调用父类中的方法
		
//		Animal myAnmial1 = new Animal();
//		myAnmial1.say();
	}

	public void test() {
		System.out.println("测试1");
		
	}

	public void test(String msg) {
		System.out.println("测试2" + msg);
	}

}
