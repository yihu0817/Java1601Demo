package com.scxh.java1601.object.practise01;

public class PassengerCar extends Car {
	int passengerCount; // 载人数

	public PassengerCar(String name, int passengerCount, float cost, int number) {
		this.name = name;
		this.passengerCount = passengerCount;
		this.cost = cost;
		this.number = number;
	}

	@Override
	public void function() {
		System.out.println("客车功能是载人");
	}

	@Override
	public String toString() {
		return "客车  [车型=" + name + ",\t 载人数=" + passengerCount + ",\t 车辆数="
				+ number + ",\t 租费=" + cost + "]";
	}

}
