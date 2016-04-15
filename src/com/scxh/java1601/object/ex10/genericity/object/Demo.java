package com.scxh.java1601.object.ex10.genericity.object;
/**
 * x = 10             y = 10
   x = 12.88          y = 129.65
   x = "东经180度"      y = "北纬210度" 
   
   x = 30.11          y = "北纬215度" 错误设置
   
 *
 */
public class Demo {

	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(10);
		int x = (Integer)p.getX();  //Object 向下转型-> Integer 拆包 -> int
		int y = (Integer)p.getY();
		System.out.println("This point is：" + x + ", " + y);
		
		
		p.setX(25.88);  // double -> Dobule -> Object
		p.setY(129.65);
		double m = (Double)p.getX();  // 必须向下转型
		double n = (Double)p.getY();  // 运行期间抛出异常
		System.out.println("This point is：" + m + ", " + n);

		
		p.setX("东经180度");
		p.setY("北纬210度");
		String a = (String)p.getX();
		String b = (String)p.getY();
		System.out.println("This point is：" + a + ", " + b);
		
		p.setX(30.11);
		p.setY("北纬215度");
		double c = (Double)p.getX();
		
		if(p.getY() instanceof String){
			 String s = (String)p.getY();
			 System.out.println("This point is：" + c + ", " + s);
		}
		if(p.getY() instanceof Double){
			 double d = (Double)p.getY();
			 System.out.println("This point is：" + c + ", " + d);
		}
		
		
		
	}

}
