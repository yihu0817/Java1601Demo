package com.scxh.java1601.object.extend;

/**
 * 子类继承父类的所有成员变量 
 * 子类继承父类除构造方法以外的成员方法，子类不能继承父类的构造方法。
 *  因为父类构造方法创建的是父类对象，子类必须声明自己的构造方法，创建子类自己的对象。 
 * 子类不能删除父类成员。
 * 子类可以增加自己的成员变量和成员方法。 子类可以重定义父类成员。
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Manager managerZhang = new Manager();
		managerZhang.name = "张经理";
		managerZhang.sex = "男";
		managerZhang.empClass = "高级";
		managerZhang.vehicle = true;

		System.out.println(managerZhang.name + "是" + managerZhang.empClass
				+ "经理" + "性别是" + managerZhang.sex);

		Worker workerA = new Worker();
		workerA.name = "李大姐";
		workerA.sex = "女";
		workerA.category = "纺织工人";
		workerA.dressAllowance = false;

	}

}
