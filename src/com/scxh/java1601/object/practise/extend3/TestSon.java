package com.scxh.java1601.object.practise.extend3;

public class TestSon {

	public static void main(String[] args) {
//		TestSon test = new TestSon();
//		test.testSon();
		
		TestSon.testFahter();
	}
	

	public void testSon() {
		Father zhangFather = new Father();
		Father liFather = new Father();

		Father zhouFather = liFather;

		System.out.println(zhouFather.equals(liFather));

		System.out.println(zhouFather == liFather);
	}
	
	public static void testFahter(){
		System.out.println("静态方法》》》》");
	}

}
