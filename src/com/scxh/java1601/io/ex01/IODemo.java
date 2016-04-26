package com.scxh.java1601.io.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo {

	public static void main(String[] args) {
		IODemo io = new IODemo();
//		io.readMessageByFile();
//		io.writeMessageToFile();
		io.readDataBykeyBoard();
//		io.readDataFromTxt();
//		io.readDataFromReaderTxt();
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
			byte[] b = new byte[4];
			System.out.println("请输入内容:");
			System.in.read(b);
			
			String s = new String(b);
			System.out.println("键盘输入的内容是 :"+s);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void readDataFromTxt(){
		File file = new File("F://test1.txt"); // File表示文件
		FileInputStream is = null;
		try {
			is = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(is);
			int k;
			System.out.println("readDataFromTxt");
			while((k=isr.read()) != -1){
				char c  = (char)k;
				System.out.print(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void readDataFromReaderTxt(){
		File file = new File("F://test1.txt"); // File表示文件
		FileReader is = null;
		try {
			is = new FileReader(file);
			int k;
			while((k=is.read()) != -1){
				char c  = (char)k;
				System.out.print(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
