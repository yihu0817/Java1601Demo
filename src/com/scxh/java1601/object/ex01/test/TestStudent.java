package com.scxh.java1601.object.ex01.test;

import java.util.Scanner;

/**
 * 用数组存储3个学生对象，要求从键盘输入学生信息,控制台显示所有学生信息。
 *
 */
public class TestStudent {
	private static final int STUDENT_NUMBER = 1; //录入学生个数
	
	public static void main(String[] args) {
		TestStudent test = new TestStudent();
		Student[] studentArray = test.saveStudentToArray(STUDENT_NUMBER);
		test.showStudentsMsg(studentArray);
	}
	
	/**
	 * 用数组存储3个学生对象，要求从键盘输入学生信息,控制台显示所有学生信息。
	 * 实现方式二
	 * 
	 * 从键盘录入学生信息构造学生对象保存到数组中
	 * 
	 * @return
	 */
	public Student[] saveStudentToArray(int number) {
		Scanner scanner = new Scanner(System.in);
		Student[] studentArray = new Student[number];//实例化存储学生数组
		int length = studentArray.length;

		for (int i = 0; i < length; i++) {
			System.out.println("========录入第" + (i + 1) + "个学生信息====");
			System.out.println("请输入学生姓名:");
			String name = scanner.next();
			System.out.println("请输入学生年龄:");
			int age = scanner.nextInt();
			System.out.println("请输入学生编号:");
			int id = scanner.nextInt();
			System.out.println("请输入学生性别:");
			String sex = scanner.next();

			Student student = new Student(name, age, id, sex);//构造学生对象
			studentArray[i] = student;
		}

		return studentArray;
	}

	/**
	 * 显示学生数组信息
	 * 
	 * @param studentArrays
	 */
	public void showStudentsMsg(Student[] studentArrays) {
		System.out.println("姓名\t年龄\t 编号\t性别");
		int length = studentArrays.length;
		for (int i = 0; i < length; i++) {
			Student student = studentArrays[i];
//			System.out.println(student); //直接显示对象，因为Student类重写了toString()方法
			printStudentMsg(student);
		}
	}
	/**
	 * 显示学生信息, 通过对象.属性
	 * @param student
	 */
	public void printStudentMsg(Student student){
		String names = student.name;
		int ages = student.age;
		int ids = student.id;
		String sexs = student.sex;
		System.out.println(names + "\t" + ages + "\t" + ids + "\t" + sexs);
	}
	
	/**
	 * 用数组存储3个学生对象，要求从键盘输入学生信息,控制台显示所有学生信息。
	 * 实现方式一
	 */
	public void testStudent() {
		/**
		 * 从键盘录入学生信息构造三个学生对象
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("========录入第一个学生信息====");
		System.out.println("请输入学生姓名:");
		String name = scanner.next();
		System.out.println("请输入学生年龄:");
		int age = scanner.nextInt();
		System.out.println("请输入学生编号:");
		int id = scanner.nextInt();
		System.out.println("请输入学生性别:");
		String sex = scanner.next();

		Student studentA = new Student(name, age, id, sex);

		System.out.println("录入学生" + studentA.name + "年龄是" + studentA.age + "岁"
				+ "编号为" + studentA.id + "性别是" + studentA.sex);

		System.out.println("========录入第二个学生信息====");
		System.out.println("请输入学生姓名:");
		name = scanner.next();
		System.out.println("请输入学生年龄:");
		age = scanner.nextInt();
		System.out.println("请输入学生编号:");
		id = scanner.nextInt();
		System.out.println("请输入学生性别:");
		sex = scanner.next();

		Student studentB = new Student(name, age, id, sex);

		System.out.println("录入学生" + studentB.name + "年龄是" + studentB.age + "岁"
				+ "编号为" + studentB.id + "性别是" + studentB.sex);

		System.out.println("========录入第三个学生信息====");
		System.out.println("请输入学生姓名:");
		name = scanner.next();
		System.out.println("请输入学生年龄:");
		age = scanner.nextInt();
		System.out.println("请输入学生编号:");
		id = scanner.nextInt();
		System.out.println("请输入学生性别:");
		sex = scanner.next();

		Student studentC = new Student(name, age, id, sex);

		System.out.println("录入学生" + studentC.name + "年龄是" + studentC.age + "岁"
				+ "编号为" + studentC.id + "性别是" + studentC.sex);

		/**
		 * 存储三个学生对象到studentArray数组中
		 */
		// 类型[] 数组名 = new 类型[n];
		Student[] studentArray = new Student[3];
		studentArray[0] = studentA;
		studentArray[1] = studentB;
		studentArray[2] = studentC;

		/**
		 * 显示已存储在数组中的学生信息
		 */
		int length = studentArray.length;
		for (int i = 0; i < length; i++) {
			Student student = studentArray[i];
			String names = student.name;
			int ages = student.age;
			int ids = student.id;
			String sexs = student.sex;

			System.out.println("第" + (i + 1) + "个学生姓名是" + names + ",年龄是" + ages
					+ "岁," + "编号为" + ids + ",性别是" + sexs);
			
		}

	}


}
