package com.scxh.java1601.object.ex07.interfaces;

public class SeagateHdd implements SataHdd {

	@Override
	public void writeData(String data) {
		 System.out.println(data+"写入成功");
	}

	@Override
	public String readData() {
		 return "数据";
	}

}
