package com.wsx.chapterdemo5;

class Person1{
	//实例变量
	public String name;
	//静态变量
	public static int eyeNum;
}

public class PersonTest1 {
	public static void main(String[] args) {
		//使用Person类自动初始化赋值实例变量静态变量
		System.out.println("Person的eyeNum静态变量值：" + Person1.eyeNum);
		Person p = new Person();
		System.out.println("p变量的name变量值是：" + p.name);
	}
}
