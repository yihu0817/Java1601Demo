package com.scxh.java1601.io.ex01;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * 学生类 Student
 * 姓名  String name = "张三";
 * 年龄 int age = 24;
 * 学号 int nuber = 10;
 * 
 * 
 * @author zhou.sir
 *
 */
public class IOTest {

	public static void main(String[] args) throws IOException {
		IOTest test = new IOTest();
		
//		String line = test.readLineFromKeyBoard();
//		System.out.println(line);
//		test.writeDataToByteArray();
		test.writeFile();
	}

	public String readLineFromKeyBoard() throws IOException {
		/**
		 * 从键盘读数据的IO操作，是由系统自动建立。 字节流是 : System.in
		 */
		System.out.println("请输入数据:");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		return line;
	}
	
	public void writeDataToByteArray() throws IOException{
		int k = 12;
		boolean b = false;
		String s = "神捕司";
		
		/**ByteArrayOutputStream :字节数组输出流*/
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		/**数据流, 功能:按数据类型写入外部设备*/
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeInt(k);
		dos.writeBoolean(b);
		dos.writeUTF(s);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		DataInputStream dis = new DataInputStream(bis);
		int k1 = dis.readInt();
		boolean b1 = dis.readBoolean();
		String s1 = dis.readUTF();
		
		System.out.println("k1 :"+k1+ ", b1 :"+b1+ ", s1 :"+s1);
	}
	
	public void writeFile(){
		int k = 12;
		boolean b = false;
		String s = "神捕司";
		
		File file = new File("F://test.txt"); // File表示文件
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(k);
			dos.writeBoolean(b);
			dos.writeUTF(s);
			
			FileInputStream bis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(bis);
			int k1 = dis.readInt();
			boolean b1 = dis.readBoolean();
			String s1 = dis.readUTF();
			
			System.out.println("k1 :"+k1+ ", b1 :"+b1+ ", s1 :"+s1);
			
			System.out.println("写文件成功！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	

}

