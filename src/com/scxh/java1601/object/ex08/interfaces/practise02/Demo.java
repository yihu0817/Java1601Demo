package com.scxh.java1601.object.ex08.interfaces.practise02;

public class Demo {

	public static void main(String[] args) {
		Phone cellPhone = new CellPhone(); //功能手机
		Phone smartPhone = new SmartPhone(); //智能手机
		Psp psp = new Psp(); //专业游戏机
		
		cellPhone.call(110);//功能手机打电话
		cellPhone.sendMessage("xx出现恐怖袭击"); //功能手机发送短信

		smartPhone.sendMessage("xx出现恐怖袭击"); //智能手机发送短信

		SmartPhone gameSmartPhone = (SmartPhone) smartPhone;
		gameSmartPhone.playGame();  //智能手机玩游戏
		gameSmartPhone.receive();
		
		psp.playGame();  //专业游戏机psp玩游戏
	}

}
