package com.scxh.java1601.object.practise.morestate;
/**
 * obj 既可以是人类，也可以是教师，它有不同的表现形式，这就被称为多态。多态是指一个事物有不同的表现形式或形态。
        多态存在的三个必要条件：要有继承、要有重写(覆盖)、父类变量引用子类对象。
 *
 */
public class Demo {

	public static void main(String[] args) {
		People obj = new People(); // 引用父类实例
		obj.say();

		/**
		 * 子类实例可赋给父类引用变量 《=》引用子类实例
		 * 引用变量obj 引用了Teacher类的实例
		 */
		obj = new Teacher(); // 引用子类实例 ; 正解，所有的教师都是人。
		obj.say();

		/**
		 * 父类的变量可以引用父类的实例，也可以引用子类的实例。 
		 * 注意反过来是错误的，因为所有的教师都是人类，但不是所有的人都是教师。 
		 * 
		 * Teacher teacher = new Teacher(); 
		 * teacher.say();
		 * teacher = new People();  //错误，不是所有的人都是教师。
		 */

	}

}
