package com.scxh.java1601.object;
/**
 * 
 * 类是具有相同状态、属性和动作、行为的对象的统称。
 * 
 * 职员类                                                                class       ->    对象
 * 状态、属性 :  姓名, 年龄, 薪资      ->  成员变量                              张三，李四
 * 行为、动作:  领工资，显示姓名          ->  成员方法                            Employee employee =  new Employee();
 *                                                 employee.name = "张三";
 *                                                 employee.age = 30;
 *                                                 employee.salar = 4000; 
 *                                                 
 *                                                 employee.showName();
 *                                                 
 *   方法作用域: 成员变量:整个类体，所有方法中起作用
 *             局部变量: 只是定义它的方法体中起作用                                             
 * 
 */
public class Employee {
	public String name; //姓名
	public int age;   //年龄
	private float salar; //薪资

	public Employee(){
		System.out.println("调用employee构造方法");
	}
	
	public Employee(String n,int a,float s){
		name = n;
		age = a;
		salar = s;
	}
	
	/**
	 * 领工资
	 * @return
	 */
	public float getSalary(){
		//计算职员工资，发放
		float s = 3000;  //局部变量
		s = salar;
		return s;
	}
	/**
	 * 显示姓名
	 */
	public void showName(){
		System.out.println(name);
	}
}
