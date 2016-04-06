package com.scxh.java1601.object;

public class Test {

	public static void main(String[] args) {
		Employee employeeA = new Employee("张三",30,4000);  //实例化职员对象 Employee
		employeeA.showName();
		
		Employee employeeB = new Employee("李四",25,5000);  //实例化职员对象 Employee
		employeeB.showName();
		
		employeeA.age = 33;
		
		/*employeeA.name = "张三";
		employeeA.age = 30;
		employeeA.salar = 4000;
		
		employeeA.showName();
		float salary = employeeA.getSalary();
		System.out.println("领的工资是 ："+salary);*/
		
	}

}
