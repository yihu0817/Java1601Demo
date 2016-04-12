package com.scxh.java1601.object.practise02;
/**
 * 功能机：具有接打电话和通过按键发送短信功能
 * @author zhou.sir
 *
 */
public class CellPhone extends Phone {

	@Override
	public void sendMessage(String msg) {
		System.out.println("按键发送的短信息 ："+msg);
	}

}
