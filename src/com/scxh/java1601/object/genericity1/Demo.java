package com.scxh.java1601.object.genericity1;
/**
 1.泛型类定义：可以使用泛型类(Java Class)，它可以接受任意类型的数据。所谓“泛型”，就是“宽泛的数据类型”，任意的数据类型
      传值参数（我们通常所说的参数）由小括号包围，如 (int x, double y)，
      类型参数（泛型参数）由尖括号包围，多个参数由逗号分隔，如 <T> 或 <T, E>。
  
 2.使用泛型类
      泛型类在实例化时必须指出具体的类型，也就是向类型参数传值，格式为：
      className variable<dataType1, dataType2> = new className<dataType1, dataType2>();
      也可以省略等号右边的数据类型，但是会产生警告，即：
      className variable<dataType1, dataType2> = new className();

   练习： 
      定义一个泛型类Point 
      设置坐标值 

 */
public class Demo {

	public static void main(String[] args) {
		// 实例化泛型类
		Point<Integer, Integer> p1 = new Point<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		
		int x = p1.getX();
		int y = p1.getY();
		p1.printPoint(x,y);
		
		p1.print(p1);

		Point<Double, String> p2 = new Point<Double, String>();
		p2.setX(25.4);
		p2.setY("东京180度");
		double m = p2.getX();
		String n = p2.getY();

		p2.printPoint(m,n);
	}

}
