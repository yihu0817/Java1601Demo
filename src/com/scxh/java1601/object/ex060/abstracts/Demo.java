package com.scxh.java1601.object.ex060.abstracts;

public class Demo {

	public static void main(String[] args) {

		People zhangSir = new Teacher();
		zhangSir.setName("张老师");
		/**
		 * 父类引用子类实例，如果要调用子类方法，必须向下转型. 
		 * 父类引用子类实例，如果要调用子类方法，方法是父类已经定义的抽象方法，可以调用.
		 */
		zhangSir.work();

		People liDriver = new Driver();
		liDriver.setName("李司机");
		liDriver.work();

		/**
		 * 防止类被实例化，可将类定义为抽象类
		 */
		// People wangPeople = new People();

		Demo obj = new Demo();
		obj.vocation(liDriver);

	}

	/**
	 * 判断职业
	 */
	public void vocation(People people) {
		if (people instanceof Teacher) {
			System.out.println("老师");
		}
		
		if (people instanceof Driver){
			System.out.println("司机");
		}
	}
}
