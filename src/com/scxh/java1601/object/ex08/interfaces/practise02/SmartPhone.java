package com.scxh.java1601.object.ex08.interfaces.practise02;
/**
 * 智能手机 : 具有接打电话和通过手写发送短信功能 并且还具有玩游戏功能
 * @author zhou.sir
 *
 */
public class SmartPhone extends Phone implements IGame{

	@Override
	public void sendMessage(String msg) {
		System.out.println("手写发送的短信息 ："+msg);
	}

	@Override
	public void playGame() {
		System.out.println("手机玩游戏");
		
	}

	
}
