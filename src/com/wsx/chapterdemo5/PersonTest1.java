package com.wsx.chapterdemo5;

class Person1{
	//ʵ������
	public String name;
	//��̬����
	public static int eyeNum;
}

public class PersonTest1 {
	public static void main(String[] args) {
		//ʹ��Person���Զ���ʼ����ֵʵ��������̬����
		System.out.println("Person��eyeNum��̬����ֵ��" + Person1.eyeNum);
		Person p = new Person();
		System.out.println("p������name����ֵ�ǣ�" + p.name);
	}
}
