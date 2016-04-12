package com.scxh.java1601.object.interfaces;

public class Demo {

	public static void main(String[] args) {
		SataHdd seagate = new SeagateHdd();
		seagate.writeData("向希捷硬盘写入数据   ");
		String data = seagate.readData();
		
		SataHdd samung = new SamsungHdd();
		samung.writeData("向三星硬盘写入数据   ");
		data = samung.readData();
	}

}
