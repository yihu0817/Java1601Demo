package com.scxh.java1601.io.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDemo {
	private static String studentDir = "F://student_store/";
	private static final String fileSuffix = ".txt";

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		FileDemo demo = new FileDemo();

		Student zhangs = new Student("张三", 18, 110);
		demo.saveStudent(zhangs, zhangs.name);

		Student stu = demo.getStudent(zhangs.name);
		System.out.println(stu);

		Student lishi = new Student("李四", 28, 111);
		demo.saveStudent(lishi, lishi.name);

		stu = demo.getStudent(lishi.name);
		System.out.println(stu);

		Student wanger = new Student("王二", 38, 112);
		demo.saveStudent(wanger, wanger.name);

		stu = demo.getStudent(wanger.name);
		System.out.println(stu);

		Student s = demo.findStudentByName(112);
		System.out.println("查询学生是 :" + s);
	}

	/**
	 * 根据学号查找学生
	 * 
	 * @param number
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public Student findStudentByName(int number) throws ClassNotFoundException,
			IOException {
		File dirFile = new File(studentDir);
		File[] fileLists = dirFile.listFiles();
		for (int i = 0, n = fileLists.length; i < n; i++) {
			File file = fileLists[i];
			Student stu = getStudent(file.getName());
			if (stu.number == number) {
				return stu;
			}
		}
		return null;
	}

	/**
	 * 创建指定文件 F://java/android/test.txt;
	 * 
	 * @throws IOException
	 */
	public File createFile(String path) throws IOException {
		File file = new File(path);
		if (file.exists())
			return file;

		int lastIndex = path.lastIndexOf("/");
		String director = path.substring(0, lastIndex);
		File dirFile = new File(director);
		if (!dirFile.exists()) {
			dirFile.mkdirs();
		}
		file.createNewFile();

		return file;
	}

	/**
	 * 保存学生信息
	 * 
	 * @param student
	 * @param name
	 * @throws IOException
	 */
	public void saveStudent(Student student, String name) throws IOException {
		String path = studentDir + name + fileSuffix;
		File file = createFile(path);
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(student);
		oos.close();
		fos.close();
	}

	/**
	 * 根据姓名获取学生
	 * 
	 * @param name
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Student getStudent(String name) throws IOException,
			ClassNotFoundException {
		String path = studentDir + name;
		if (!name.contains(".")) {
			path = studentDir + name + fileSuffix;
		}
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student = (Student) ois.readObject();
		return student;
	}
}
