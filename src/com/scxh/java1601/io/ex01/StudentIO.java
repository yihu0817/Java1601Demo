package com.scxh.java1601.io.ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentIO {
	public File file = new File("F://student_file.txt");

	public static void main(String[] args) throws IOException {
		StudentIO test = new StudentIO();
		
		Student zhangs = new Student("张三", 18, 110);
		test.saveStudent(zhangs);
		int oneByte = test.getByteFile();
		zhangs.byteCount = oneByte;
		
		Student lishi = new Student("李四", 28, 111);
		test.saveStudent(lishi);
		oneByte = test.getByteFile();
		lishi.byteCount = oneByte;
		
		Student wanger = new Student("王二",32,112);
		test.saveStudent(wanger);
		
		Student stu = test.getStudent(0);
		System.out.println(stu);
		
		stu = test.getStudent(zhangs.byteCount);
		System.out.println(stu);

		stu = test.getStudent(lishi.byteCount);
		System.out.println(stu);
	}

	public void saveStudent(Student student) throws IOException {
		FileOutputStream fos = new FileOutputStream(file,true);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF(student.name);
		dos.writeInt(student.age);
		dos.writeInt(student.number);
		dos.close();
		fos.close();
	}
	
	public Student getStudent(int n) throws IOException {
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		dis.skipBytes(n);
		String name = dis.readUTF();
		int age = dis.readInt();
		int number = dis.readInt();
		dis.close();
		fis.close();
		
		Student student = new Student(name,age,number);
		return student;
		
	}
	
	public int getByteFile() throws IOException{
		FileInputStream fis = new FileInputStream(file);
		int byteCount = fis.available();
		fis.close();
		return byteCount;
	}
	
}
