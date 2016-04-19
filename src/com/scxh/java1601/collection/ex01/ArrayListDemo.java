package com.scxh.java1601.collection.ex01;

/**
 *         Collection（接口）
 *        
 *     List(列表接口) 特点：存储有有序可重复数据 
 *          |
 *    ArrayList(类)
 */
import java.util.ArrayList;

import com.scxh.java1601.object.ex01.test.Student;

public class ArrayListDemo {
	public ArrayList<Student> studentLists = new ArrayList<Student>();// 构造一个ArrayList集合

	public static void main(String[] args) {
		ArrayListDemo demo = new ArrayListDemo();

		System.out.println("=======添加学生信息成功=============");
		demo.addStudents();
		demo.findAllStudent();
		
		System.out.println("=======根据ID查找学生信息=============");
		int studentId = 111;
		Student student = demo.findStudentById(studentId);
		System.out.println("编号为" + studentId + "的学生信息是 :" + student);
		
		System.out.println("=======根据姓名更改学生信息=============");
		demo.updateStudentByName("张三","张小三","男");
		demo.findAllStudent();
		
		System.out.println("=======移除学生信息=============");
		demo.removeStudent(student);
		demo.findAllStudent();
		
		System.out.println("=======移除学生麻0信息=============");
		demo.removeStudent("麻0");
		demo.findAllStudent();
	}

	/**
	 * 添加学生信息
	 */
	public void addStudents() {
		/**
		 * 构造两个学生对象
		 */
		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		/**
		 * 添加三个学生对象到ArrayList集合
		 */
		studentLists.add(studentA);
		studentLists.add(studentB);
		studentLists.add(studentC);

		/**
		 * 添加一百个学生对象到ArrayList集合
		 */
		for (int i = 0; i < 1; i++) {
			Student student = new Student("麻" + i, (23 + i), (i + 101),
					i % 2 == 0 ? "男" : "女");
			studentLists.add(student);
		}
	}

	/**
	 * 查询所有学生信息
	 */
	public void findAllStudent() {
		int size = studentLists.size();
		for (int i = 0; i < size; i++) {
			Student student = studentLists.get(i);
			System.out.println(student);// 显示学生对象信息
		}
	}

	/**
	 * 通过ID编号查询学生信息
	 */
	public Student findStudentById(int id) {
		int size = studentLists.size();
		Student student = null;
		for (int i = 0; i < size; i++) {
			Student s = studentLists.get(i);
			if (s.id == id) {
				student = s;
				break;
			}
		}
		return student;
	}
	
	/**
	 * 将姓名为“王二”的学生更改为"王小二"，性别改为男
	 */
	public void updateStudentByName(String oldName,String newName,String newSex){
		int size = studentLists.size();
		for (int i = 0; i < size; i++) {
			Student student = studentLists.get(i);
			String studentName = student.name;
			if (studentName.equals(oldName)) {
				student.name = newName;
				student.sex = newSex;
				break;
			}
		}
	}
	/**
	 * 移除学生成象
	 */
	public void removeStudent(Student student){
		studentLists.remove(student);
	}
	
	public void removeStudent(String name){
		int size = studentLists.size();
		for (int i = 0; i < size; i++) {
			Student student = studentLists.get(i);
			String studentName = student.name;
			if(studentName.equals(name)){
				studentLists.remove(student);
			}
		}
	}
	/**
	 * 退出系统
	 */
	public void backSystem(){
		System.exit(0);
	}
}
