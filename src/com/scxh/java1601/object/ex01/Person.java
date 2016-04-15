package com.scxh.java1601.object.ex01;
/**
 * 小王本来体重70kg，经过减肥，体重降到45kg，试从这个问题领域中识别对象、类、属性、状态和状态的变化。
分析:
    对象：  小王                           具体对象
     类 :  人                          class person
  属性:  体重,姓名                 成员变量
  状态:  胖                               成员变量
  状态变化: 减肥                      成员方法
 *
 */
public class Person {
	String name;// 姓名
    int weight;  //体重
    char figure;    //胖
    
    void loseWeight(){
        System.out.println(name+"体重"+weight+"kg,经过减肥，体重降到 45kg");
    }
}
