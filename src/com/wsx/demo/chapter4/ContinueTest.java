package com.wsx.demo.chapter4;

public class ContinueTest {
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			System.out.println("i��ֵ��"+ i);
			if(i == 3){
				continue;
			}
			System.out.println("continue���������");
		}
	}
}
