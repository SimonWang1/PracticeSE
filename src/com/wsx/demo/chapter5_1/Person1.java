package com.wsx.demo.chapter5_1;

public class Person1 {
	//�����ʼ���飬�����ڹ�����ִ�У�ֻ�趨��һ��
	{
		int a = 6;
		if(a > 4) {
			System.out.println("Person��ʼ���飬�ֲ�����a��ֵ����4");
		}
		System.out.println("Person�ĳ�ʼ����");
	}
	//����ڶ�����ʼ���飬˳��ִ��
	{
		System.out.println("�ڶ�����ʼ����");
	}
	public static void main(String[] args){
		new Person1();
	}
	//�����޲ι�����
	public Person1(){
		System.out.println("Person1����޲ι�����");
	}
}
