package com.wsx.demo.chapter5;

public class ThisInConstructor {
	//����foo��Ա����
	public int foo;
	public ThisInConstructor() {
		//�ڹ������и�foo������ֵ
		this.foo = 6;
	}
	public static void main(String[] args) {
		//ȡֵ
		System.out.println(new ThisInConstructor().foo);
	}
}
