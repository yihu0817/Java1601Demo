package com.scxh.java1601.object.practise;



public class Test {

	public static void main(String[] args) {
	
		
	  //对象类型    对象名称   =  new 对象类型();
		Animal dogAnimal = new Animal("小狗","灰色",6); // dogAnimal对象 表示年龄是3岁，毛色是灰色的狗
//		dogAnimal.name = "小狗1";
		
		
		Animal catAnimal = new Animal("小猫","白色",4); // animal2对象 表示年龄是2岁，毛色是白色的猫
		
		catAnimal.eat();
		
		dogAnimal.howl();
		
	}
	
	
	
	
	/*public void testAnimal1(){
		Animal dogAnimal = new Animal(); // dogAnimal对象 表示年龄是3岁，毛色是灰色的狗
		dogAnimal.name = "狗";
		dogAnimal.color = "灰色";
		dogAnimal.age = 3;

		Animal catAnimal = new Animal(); // animal2对象 表示年龄是2岁，毛色是白色的猫
		catAnimal.name = "猫";
		catAnimal.color = "白色";
		catAnimal.age = 4;
		
		catAnimal.eat();
		
		dogAnimal.howl();
	}*/

}
