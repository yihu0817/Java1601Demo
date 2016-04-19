package com.scxh.java1601.collection.practise01;

import java.lang.reflect.Array;

/**
 * 用数组实现队列效果 特点： 先进先出 队头添加元素，队尾获取元素。 清理队列元素， 获取队列长度。
 * 
 * 
 * @author zhou.sir
 *
 */
public class ArrayQueueF<T> {
	private final int size = 5; // 队列默认长度
	private T[] t;
	private int i = -1;
	private int j = -1;

	/**
	 * 按照默认长度初始化队列
	 */
	public ArrayQueueF(String s) {
		// students = new T[size];
		try {
			Class tType = Class.forName(s);
			t = (T[]) Array.newInstance(tType, size);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 按照指定长度初始化队列
	 * 
	 * @param size
	 */
	public ArrayQueueF(String s,int size) {
		// students = new T[size];
		try {
			Class tType = Class.forName(s);
			t = (T[]) Array.newInstance(tType, size);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 添加数据
	 * 
	 * @param stu
	 */
	public void add(T stu) {
		if (++i < t.length) {
			t[i] = stu;
			System.out.println("添加" + i);
		} else {
			System.out.println("队列已满");
		}
	}

	/**
	 * 获取队列数据
	 * 
	 * @return
	 */
	public T get() {
		if (++j < t.length) {
			return t[j];
		} else {
			System.out.println("队列数据已取完");
			return null;
		}
	}

	/**
	 * 清空队列
	 */
	public void clear() {
		for (int i = 0; i < t.length; i++) {
			t[i] = null;
		}
	}

	/**
	 * 队列长度
	 * 
	 * @return
	 */
	public int size() {
		return t.length;
	}
}
