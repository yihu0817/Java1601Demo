package com.scxh.java1601.object.practise.extend;

public class Test {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.name = "小张";
		teacher.age = 25;
		teacher.height = 1.7f;
		teacher.say();
		
		teacher.school = "华信智原";
		teacher.seniority = "高级";
		teacher.subject = "java";
		teacher.lecturing();
		
		
		People people = new People();
		people.name = "普通人";
		people.age = 24;
		people.height = 1.8f;
		people.say();
		
		
		
	}

}
