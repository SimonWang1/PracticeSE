package com.wsx.chapterdemo4;

public class SwitchTest {
	public static void main(String[] args) {
		char score = 'b';
		switch (score) {
		case 'a':
			System.out.println("��");
			break;
		case 'b':
			System.out.println("��");
			break;
		case 'c':
			System.out.println("����");
			break;
		case 'd':
			System.out.println("������");
			break;
		default:
			System.out.println("�������");
		}
	}
}
