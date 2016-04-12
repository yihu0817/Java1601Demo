package com.scxh.java1601.object.practise02;
/**
 * 
 * @author zhou.sir
 *
 */
public abstract class Phone {
	/**
	 * 打电话
	 * @param tel
	 */
	public void call(int tel){
		System.out.println("正在呼叫电话号码是"+tel+"的用户.");
	}
	/**
	 * 接电话
	 */
	public void receive(){
		System.out.println("正在接听电话");
	}
	/**
	 * 发短信
	 * @param msg
	 */
	public abstract void sendMessage(String msg);
}
