package com.wsx.demo.chapter6;

public class InterfaceStandardTest {
	public static void main(String[] args) {
		// ��Ҫ������һ�����е�Output�ӿڵ�MAX_CACHE_LINE����Ҫ�Ӱ���
		System.out.println(com.wsx.demo.chapter6.InterfaceStandard.MAX_CACHE_LINE);
		// ��������"Ϊfinal������ֵ"�ı����쳣
		// Output.MAX_CACHE_LINE = 20;
		// ʹ�ýӿڵ��÷���
		System.out.println(InterfaceStandard.staticTest());
	}
}
