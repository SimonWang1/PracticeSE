package com.wsx.demo.chapter5_1;

class BaseClass {
	public int a = 5;
}

public class SubClass extends BaseClass{
	//���า�Ǹ�������a
	public int a = 7;
	public void accessOwner() {
		System.out.println(a);
	}
	
	public void accessBase() {
		//ͨ��super�ؼ��ַ��ʸ�������a
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.accessOwner();
		sc.accessBase();
	}
}
