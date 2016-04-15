package com.scxh.java1601.object.ex08.interfaces.practise01;

public class Demo {

	public static void main(String[] args) {
		Car passerCar = new PassengerCar("小客车", 5, 200.0f, 10);
		Car bus = new PassengerCar("大巴车", 20, 400.0f, 15);
		
		Car heavyTruckCar = new TruckCar("重卡",6,500.0f,5);
		Car lightTruckCar = new TruckCar("轻卡",1.5f,450.0f,15);
		
		/**
		 * 类型[]  数组名 =  new 类型[4];
		 */

		Car[] carArrays = new Car[4];
		carArrays[0] = passerCar;
		carArrays[1] = bus;
		carArrays[2] = heavyTruckCar;
		carArrays[3] = lightTruckCar;
		
		int length = carArrays.length;
		for(int i = 0; i < length; i++){
			Car car = carArrays[i];
			/**
			 * if(car instanceof PassengerCar){}
			 */
			System.out.println(car);
		}
	}

}
