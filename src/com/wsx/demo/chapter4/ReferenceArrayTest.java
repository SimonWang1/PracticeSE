package com.wsx.demo.chapter4;

public class ReferenceArrayTest {
	public static void main(String[] args){
		Person[] students;
		students = new Person[2];
		Person zhang = new Person();
		zhang.age = 17;
		zhang.height = 177;
		Person lee = new Person();
		lee.age = 19;
		lee.height = 173;
		students[0] = zhang;
		students[1] = lee;
		zhang.info();
//		������������ָ����ͬ�Ķ��ڴ��ַ��������ʾ��ͬ����
		lee.info();
		students[1].info();
	}
}
