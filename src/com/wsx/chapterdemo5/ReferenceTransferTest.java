package com.wsx.chapterdemo5;

class DataWrap {
	int a;
	int b;
}

public class ReferenceTransferTest {
	public static void main(String[] args) {
		DataWrap dw = new DataWrap();
		dw.a = 6;
		dw.b = 3;
		swap(dw);
		System.out.println("����������a��Ա������ֵ��" + dw.a + "��b��Ա������ֵ��" + dw.b);
	}
	public static void swap(DataWrap dw) {
		//ֵ����
		int tmp = dw.a;
		dw.a = dw.b;
		dw.b = tmp;
		System.out.println("swap�����a��Ա������ֵ��" + dw.a + "��b��Ա������ֵ��" + dw.b);
	}
	
}
