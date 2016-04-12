package com.scxh.java1601.object.practise01;

public class TruckCar extends Car {
	float weight; // 载重量

	public TruckCar(String name, float weight, float cost, int number) {
		this.name = name;
		this.weight = weight;
		this.cost = cost;
		this.number = number;
	}

	@Override
	public void function() {
		System.out.println("卡车功能是载货");
	}

	@Override
	public String toString() {
		return "卡车  [车型=" + name + ",\t 载重量=" + weight + ",\t 车辆数="
				+ number + ", \t租费=" + cost + "]";
	}

}
