package com.scxh.java1601.object.ex07.interfaces;

/**
 * 硬盘接口定义 写数据 读数据
 * 	
	public static final int CONNECT_LINE = 4; //连接线数量
	
	public abstract void writeData(String data);
	public abstract String readData();
	
 */
public interface SataHdd {
	int CONNECT_LINE = 4; //连接线数量
	/**
	 * 写数据
	 * @param data
	 */
	void writeData(String data);

	/**
	 * 读数据
	 * @return
	 */
	String readData();
}
