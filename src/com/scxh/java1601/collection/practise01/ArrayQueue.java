package com.scxh.java1601.collection.practise01;

import com.scxh.java1601.object.ex01.test.Student;

/**
 * 用数组实现队列效果 
 *  特点： 先进先出 
 *  队头添加元素，队尾获取元素。 
 *  清理队列元素， 获取队列长度。
 * 
 * 
 * @author zhou.sir
 *
 */
public class ArrayQueue {
	private final int size = 5; // 队列默认长度
	private Student[] students;
	private int i = -1; 
	private int j = -1; 
	/**
	 * 按照默认长度初始化队列
	 */
	public ArrayQueue() {
		students = new Student[size];
	}

	/**
	 * 按照指定长度初始化队列
	 * @param size
	 */
	public ArrayQueue(int size) {
		students = new Student[size];
	}
	/**
	 * 添加数据
	 * @param stu
	 */
	public void add(Student stu){
		if(++i < students.length){
			students[i] = stu;
			System.out.println("添加"+i);
		}else{
			System.out.println("队列已满");
		}
	}
	/**
	 * 获取队列数据
	 * @return
	 */
	public Student get(){
		if(++j < students.length){
			return students[j];
		}else{
			System.out.println("队列数据已取完");
			return null;
		}
	}
	/**
	 * 清空队列
	 */
	public void clear(){
		for(int i = 0; i < students.length; i++){
			students[i] = null;
		}
	}
	/**
	 * 队列长度
	 * @return
	 */
	public int size(){
		return students.length;
	}
}
