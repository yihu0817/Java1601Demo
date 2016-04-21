package com.scxh.java1601.reflect.ex01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * java反射机制
 * helloWorld.java -编译 -> helloWorld.class  -解释 ->执行
 *  
 * 
 * 静态加载: 默认加载方式
 * 动态加载: java反射机
 * 
 *
 */

public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String animaName = "dog";
		
		Animal animal = null;
		if(animaName.equals("dog")){
//			animal = new Dog();
			Class claze = Class.forName("com.scxh.java1601.reflect.ex01.Dog");
			Constructor c = claze.getConstructor(null);
			animal = (Animal) c.newInstance(null);
			
		}else{
//			animal = new Cat();
			Class claze = Class.forName("com.scxh.java1601.reflect.ex01.Cat");
			Constructor c = claze.getConstructor(null);
			animal = (Animal) c.newInstance(null);
		}
		
		animal.eat();
	}

}
