package com.wsx.demo.chapter5_1;

public class ConversionTest {
	public static void main(String[] args) {
		double d = 3.14;
		long l = (long)d;
		System.out.println(l);
//		int in = 5;
		//��ͬ����֮�䲻���໥ת��
//		boolean b = (boolean)in;
		Object obj = "Hello";
		//Object���String֮����ڼ̳й�ϵ������ת��
		String objStr = (String)obj;
		System.out.println(objStr);
	}
}
