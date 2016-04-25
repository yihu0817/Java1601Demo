package com.scxh.java1601.io.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String[] args) {
		IODemo io = new IODemo();
//		io.readMessageByFile();
//		io.writeMessageToFile();
		
		io.readDataBykeyBoard();
	}

	public void readMessageByFile() {
		try {
			File file = new File("F://test.txt"); // File表示文件

			FileInputStream fileInputStream = new FileInputStream(file);// 文件字节输入流

			byte[] fileByte = new byte[1024];
			fileInputStream.read(fileByte);
			String str = new String(fileByte);
			
			System.out.println(str);
			
			fileInputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件找不到");
		}
	}

	public void writeMessageToFile() {
		File file = new File("F://test.txt"); // File表示文件
		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(file,true);
			String msg = "java基础学习"; //表示文件换行符: \r\n
			
			byte[] b = msg.getBytes();
			
			fileOutputStream.write(b);
			
			System.out.println("写文件成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null)
					fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void readDataBykeyBoard(){
		try {
			byte[] b = new byte[100];
			System.out.println("请输入内容:");
			System.in.read(b);
			
			String s = new String(b);
			System.out.println("键盘输入的内容是 :"+s);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
