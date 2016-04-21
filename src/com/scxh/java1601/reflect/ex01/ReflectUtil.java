package com.scxh.java1601.reflect.ex01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.scxh.java1601.object.ex01.test.Student;
import com.scxh.java1601.util.Log;

/**
 * for-each 
 * for(类型 对象 : 集合){
 * 
 * } 
 * Student[] list = new Student[10]; 
 * ArrayList<Student> list = new ArrayList<Student>(); 
 * for(Student stu : list){
 * 
 * }
 */

public class ReflectUtil {

	public static void main(String[] args) throws ClassNotFoundException {
		showDeclaredParameter(getClaze());
		showConstruction(getClaze());
		showDeclaredMethods(getClaze());
	}
	/**
	 * 获取类对象
	 * @throws ClassNotFoundException 
	 */
	public static Class getClaze() throws ClassNotFoundException{
		Class classObj1 = Student.class;
//		Class classObj2 = new Dog().getClass();
//		Class classObj3 = Class.forName("com.scxh.java1601.object.ex01.test.Student");

//		Log.d(classObj1.getName());
		
		return classObj1;
	}
	
	/**
	 * 显示成员方法头
	 * @param calze
	 */
	public static void showDeclaredMethods(Class calze){
		// Method[] methods = classObj1.getMethods(); //获取所有成员方法包含 父类成员方法
		Method[] methods = calze.getDeclaredMethods(); //获取类里所有成员方法
		for (int i = 0, n = methods.length; i < n; i++) {
			String methodName = methods[i].getName();
			Class returnType = methods[i].getReturnType();
			Class[] parameterType = methods[i].getParameterTypes();

			Log.v(subString(returnType.getName()) + " " + methodName + "(");
			for (Class p : parameterType) {
				Log.v(subString(p.getName()) + " ");
			}
			Log.d(")");
		}
	}
	
	public static void showDeclaredParameter(Class claze){
		Field[] fields = claze.getDeclaredFields();
		for(Field f : fields){
			String fieldName = f.getName();
			Class parameterType = f.getType();
			
			String ptName = subString(parameterType.getName());
			Log.d(ptName+ "\t"+fieldName);
		}
	}
	
	public static void showConstruction(Class claze){
		Constructor[] constructors = claze.getConstructors();
		for(Constructor c : constructors){
			String constructorName = c.getName();
			
			Class[] parameterType = c.getParameterTypes();
			Log.v(subString(constructorName) + "(");
			for (Class p : parameterType) {
				Log.v(subString(p.getName()) + " ");
			}
			Log.d(")");
		}
	}
	
	public static String subString(String str){
		String ptName = str;
		if(ptName.contains(".")){
			int lastIndex = ptName.lastIndexOf(".");
			ptName = ptName.substring(lastIndex+1);
		}
		return ptName;
	}

}
