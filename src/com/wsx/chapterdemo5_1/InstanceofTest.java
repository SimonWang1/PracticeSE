package com.wsx.chapterdemo5_1;

public class InstanceofTest {
	public static void main(String[] args) {
		//ʹ��Object������hello��hello�ı���ʱ������Object
		//hello��ʵ��������String
		Object hello = "Hello";
		//String��Object���ڼ̳й�ϵ�������жϣ�����ture
		System.out.println("�ַ����Ƿ���Object���ʵ����"
				+ (hello instanceof Object));
		//Math��Object���ڼ̳й�ϵ�������жϣ�����false
		System.out.println("�ַ����Ƿ���Math���ʵ����"
				+ (hello instanceof Math));
		System.out.println("�ַ����Ƿ���String���ʵ����"
				+ (hello instanceof String));
		//Stringʵ����Comparable�ӿڣ�����true
		System.out.println("�ַ����Ƿ���Comparable��ʵ����"
				+ (hello instanceof Comparable));
//		String a = "Hello";
//		String��Math�����ڼ̳й�ϵ���������
//		System.out.println("�ַ����Ƿ���Math���ʵ����"
//				+ (a instanceof Math));
	}
}
