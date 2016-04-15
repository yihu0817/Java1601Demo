package com.scxh.java1601.object.ex11.genericity.method;

public class Point {
	
	public <V1, V2> void print(V1 x, V2 y) {
		System.out.println("this point is " + x + y);
	}

}
