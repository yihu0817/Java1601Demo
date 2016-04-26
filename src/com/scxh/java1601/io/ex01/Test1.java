package com.scxh.java1601.io.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test1 {
	public File file = new File("F://student_file_o.txt");
	public ArrayList<Student> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Test1 test = new Test1();
		
		Student zhangs = new Student("张三", 18, 110);
		test.saveStudent(zhangs);

		Student lishi = new Student("李四", 28, 111);
		test.saveStudent(lishi);
		
		Student stu = test.getStudent();
		System.out.println(stu);

		stu = test.getStudent();
		System.out.println(stu);
	}
	
	public void saveStudent(Student student) throws IOException{
		FileOutputStream fos = new FileOutputStream(file,true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		fos.close();
	}

	public Student getStudent() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student)ois.readObject();
		return student;
	}
	
}
