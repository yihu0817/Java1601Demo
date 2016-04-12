package com.scxh.java1601.object.practise01;

public class PickCar extends Car implements IFunction {

	@Override
	public void carryPerson() {
		System.out.println("具有载人功能");
	}

	@Override
	public void carryCargo() {
		System.out.println("具有载货功能");
	}

	@Override
	public void function() {
		System.out.println("运东西");
	}

}
