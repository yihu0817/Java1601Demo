package com.scxh.java1601.object.genericity.paractise;

public class Test {

	public static void main(String[] args) {
		Point p = new Point();
		String x = "东经120度";
		double y = 30.33;
		p.print(x, y);
		
		p = new Point();
		int x1 = 20;
		double y1 = 30.33;
		p.print(x1, y1); 
		

	}

}
