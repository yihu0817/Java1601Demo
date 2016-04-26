package com.scxh.java1601.io.ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 分别用三种方式实现
 * 1.字节输出流
 * 2.字符输出流
 * 3.缓冲流  (通过字节输出流 转换成字符输出流,在通过字符输出缓冲流写5行字符串数据到文件中)
 * 
 * String s1 = "面完试他就觉得这些问题回答的很糟糕，心里有些隐忧。";
 * s2 = "在返程的路上，他收到了HR总监的回复，说“通过和同事的综合测评，你的经历不合适这份工作。";
 * s3 = "深度，广度，远见不仅刺醒了他也深深刺醒了我，他如此自己又何尝不是呢。";
 * s4 = "再仔细分析那几个问题，其实针对性很强的。";
 * s5 = "平时也喜欢看书，也买了不少书，但基本等于白看，仅仅记住几个观点没深刻理解书中的体系结构，知识不成体系是没多大价值的。";
 * 
 * 
 * @author zhou.sir
 *
 */

public class IOCharDemo {

	public static void main(String[] args) throws IOException {
		IOCharDemo io = new IOCharDemo();
//		 io.readData();
//		io.writeData();
		
		io.readBufferData();
	}

	public void readData() {
		FileReader reader = null;
		try {
			File testFile = new File("F://test.txt");
			reader = new FileReader(testFile);

			char[] cbuf = new char[1024];
			int length = reader.read(cbuf); // 读文件中字符长度
			String s = new String(cbuf, 0, length);
			System.out.print("读取的字符个数为：" + length + ",内容为：\n");
			System.out.println(s);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void writeData() {
		FileWriter writer = null;
		File testFile = new File("F://test.txt");
		try {
			writer = new FileWriter(testFile);
			String s = "你好java";
			writer.write(s);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void readBufferData() throws IOException{
		File testFile = new File("F://test1.txt");
		FileReader reader = new FileReader(testFile);
		BufferedReader bufferReader = new BufferedReader(reader);
		
		String line;
		StringBuilder sb = new StringBuilder();
		while((line = bufferReader.readLine()) != null){
			sb.append(line);
			sb.append("\n");
		}
		System.out.print(sb.toString());
		
		/*int k;
		while( (k = reader.read()) != -1){
			char c = (char)k;
			System.out.print(c);
		}*/
		
	}

}
