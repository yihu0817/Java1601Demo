package com.scxh.java1601.reflect.ex01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.scxh.java1601.util.Log;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
//		A obja = new A();
//		obja.method1();
		
		Class claze = Class.forName("com.scxh.java1601.reflect.ex01.A");
		Constructor constructor = claze.getConstructor(null); //调用类必须要有默认构造方法
		A obj = (A) constructor.newInstance(null);
		Method m = claze.getDeclaredMethod("method2", String.class);
		m.invoke(obj, new String("反射调用"));
	}

}

class A{
	public A(){
	}
	public void method1(){
		Log.d("调用类A 的111a方法");
	}
	public void method2(String msg){
		Log.d("调用类A 的method2方法: "+msg);
	}
}
