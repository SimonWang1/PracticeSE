package com.wsx.demo.chapter5;

class Person1 {
	// ȫ�ֱ����洢�ڶ��м���ʱ�Զ���ʼ����ֵʵ�������뾲̬����
	// ʵ������
	public String name;
	// ��̬����
	public static int eyeNum;
}

public class PersonTest1 {
	public static void main(String[] args) {
		System.out.println("Person��eyeNum��̬����ֵ��" + Person1.eyeNum);
		Person1 p = new Person1();
		System.out.println("p������name����ֵ�ǣ�" + p.name);
	}
}
