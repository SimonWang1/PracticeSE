package com.wsx.demo.chapter5_1;

public class InstanceInitTest {
	// ʵ������ʼ˳��
	// ִ�г�ʼ���齫����a��ֵΪ6
	{
		a = 6;
	}
	
	// �޸ı���a��ֵ
	int a = 9;

	public static void main(String[] args) {
		System.out.println(new InstanceInitTest().a);
	}
}
