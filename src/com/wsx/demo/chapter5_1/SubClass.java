package com.wsx.demo.chapter5_1;

class BaseClass {
	// super���ʸ�������
	public int a = 5;
}

public class SubClass extends BaseClass{
	// ������д��������a
	public int a = 7;
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.accessOwner();
		sc.accessBase();
		// ��������ָ�����๹���������ʸ�������
		BaseClass bc = new SubClass();
		System.out.println(bc.a);
	}
	
	public void accessOwner() {
		System.out.println(a);
	}
	
	public void accessBase() {
		// ͨ��super�ؼ��ַ��ʸ�������a
		System.out.println(super.a);
	}
}
