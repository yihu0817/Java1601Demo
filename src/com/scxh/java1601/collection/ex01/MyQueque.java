package com.scxh.java1601.collection.ex01;

import java.util.LinkedList;

public class MyQueque<E> extends LinkedList<E>{
	/**
	 * 队尾插入对象
	 * @param e
	 */
	public void insertQueuqeLast(E e){
		addLast(e);
	}
	/**
	 * 队头获取对象
	 */
	public E getQueuqeFirst(){
		return removeFirst();
	}
}
