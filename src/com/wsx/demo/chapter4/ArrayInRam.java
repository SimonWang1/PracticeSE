package com.wsx.demo.chapter4;

public class ArrayInRam {
	public static void main(String[] args){
		int[] a = {5,2,7,9};
		int[] b = new int[5];
		System.out.println("b�����鳤��:" + b.length);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		b = a;
//		��Ϊ��ֵ�����޸�������B�ĵ�ַָ������A������B����ĳ���û�б仯��û�����õȴ�GC����
		System.out.println("���¸�ֵ֮������鳤��:" + b.length);
	}
}
