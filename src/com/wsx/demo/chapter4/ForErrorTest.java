package com.wsx.demo.chapter4;

public class ForErrorTest {
	// ��ѭ��
	public static void main(String[] args){
		for(int count = 0; count < 10; count++){
			System.out.println(count);
			// ����������Ϊ0
			count *= 0.1;
		}
		System.out.println("ѭ������");
	}
}
