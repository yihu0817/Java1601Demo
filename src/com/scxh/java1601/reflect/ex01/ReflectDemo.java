package com.scxh.java1601.reflect.ex01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.scxh.java1601.util.Log;

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A obja = new A();
		obja.method1();
		
		Class claze = Class.forName("com.scxh.java1601.reflect.ex01.A");
		Method m = claze.getDeclaredMethod("method2", String.class);
		m.invoke(obja, new String("反射调用"));
	}

}

class A{
	public void method1(){
		Log.d("调用类A 的111a方法");
	}
	public void method2(String msg){
		Log.d("调用类A 的method2方法: "+msg);
	}
}
