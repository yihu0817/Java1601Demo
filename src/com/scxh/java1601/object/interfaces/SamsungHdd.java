package com.scxh.java1601.object.interfaces;

public class SamsungHdd implements SataHdd,FixHdd {

	@Override
	public void writeData(String data) {
		 System.out.println(data+"写入成功");
	}

	@Override
	public String readData() {
		 return "数据";
	}

	@Override
	public boolean doFix() {
		return true;
	}

}
