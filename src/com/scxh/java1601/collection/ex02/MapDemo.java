package com.scxh.java1601.collection.ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import com.scxh.java1601.object.ex01.test.Student;

/**
 * Map 接口 HashMap HashTable
 * 
 *   定义一个HashMap 用于存储Teacher对象 至少4个，用Teacher编号作为key;
 *   Teacher： 编号  id;  姓名  name;  年龄 age;
 * 
 * 
 * @author zhou.sir
 *
 */
public class MapDemo {

	public static void main(String[] args) {
		MapDemo demo = new MapDemo();
//		demo.testArrayList();
		demo.testHashMap();
	}
	/**
	 * 学习ArrayList存储数据和取数据
	 */
	public void testArrayList(){
		ArrayList<Student> list = new ArrayList<>();

		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		Student studentD = new Student("麻子", 25, 333, "女");
		
		list.add(studentA);
		list.add(studentB);
		list.add(studentC);
		list.add(studentD);
		
		for(int i = 0, n = list.size(); i < n; i++){
			Student student = list.get(i);
			if(student.name.equals("王二")){
				System.out.println(student);
				break;
			}
		}
	}
	/**
	 * 学习HashMap存储数据和取数据
	 */
	public void testHashMap() {
		Hashtable<String,Integer> hashTable = new Hashtable<>();
		hashTable.put("1", new Integer(1));
//		hashTable.put(null, null); 错误
		int i = hashTable.get("1");
		
		HashMap<String, Student> hashMap = new HashMap<String, Student>();

		Student studentA = new Student("张三", 23, 111, "男");
		Student studentB = new Student("李四", 24, 222, "男");
		Student studentC = new Student("王二", 25, 333, "女");
		Student studentD = new Student("麻子", 25, 333, "女");

		hashMap.put("张三", studentA);
		hashMap.put("李四", studentB);
		hashMap.put("王二", studentC);
		hashMap.put("麻子", studentD);
		hashMap.put(null, null);

		Student wanger = hashMap.get("王二");
		System.out.println(wanger);
		
		/**
		 * HashMap遍历
		 */
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String key = iterator.next();
			System.out.println(key);
			
			Student student = hashMap.get(key);
			System.out.println(student);
		}
		
		
	}

}
