package com.scxh.java1601.object.ex07.interfaces;

public class TestSataHdd {

	public static void main(String[] args) {
		SataHdd seagate = new SeagateHdd();
		seagate.writeData("向希捷硬盘写入数据   ");
		String data = seagate.readData();
		
		SataHdd samung = new SamsungHdd();
		samung.writeData("向三星硬盘写入数据   ");
		data = samung.readData();
	}

}
