package com.wsx.demo.property_fz;

public class GirlFriend {
	// ������
	public static void main(String[] args) {
		// ��������������Friend��jth��ʾ���ã���ջ�ڴ��д洢���ڴ��ַ
		// "=" ��ʾָ��ʹ��new�ؼ��ֵ������ع������ڶ��ڴ洴�����󲢸�ֵ
		Friend jth = new Friend("���ٻ�", 'Ů', 19, 52, 165, "C", "�ڳ�ֱ");
		System.out.println("new���������");
		// ʹ�ö������õ���get�����ڿ���̨��ʽ����ӡ���
		System.out.format("Name: " + jth.getName() + "%nAge: " + jth.getAge() + "%nSex: " + jth.getSex() + "%nSize:"
				+ jth.getSize() + "%nWeight: " + jth.getWeight() + "%nHeight: " + jth.getHeight() + "%nProperty: "
				+ jth.getProperty() + "%n");
		System.out.println("*********************************************");
		Friend xyjy = new Friend("��ԫ����", '��', 1988, 49, 169, "D", "������");
		System.out.format("Name: " + xyjy.getName() + "%nAge: " + xyjy.getAge() + "%nSex:" + xyjy.getSex() + "%nSize: "
				+ xyjy.getSize() + "%nWeight: " + xyjy.getWeight() + "%nHeight: " + xyjy.getHeight() + "%nProperty: "
				+ xyjy.getProperty() + "%n");
	}
}
