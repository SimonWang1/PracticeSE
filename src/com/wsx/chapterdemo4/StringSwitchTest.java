package com.wsx.chapterdemo4;

import java.util.Scanner;

public class StringSwitchTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뼾�ڣ�");
		String season = sc.nextLine();
		switch (season) {
		case "����":
			System.out.println("��������");
			break;
		case "����":
			System.out.println("��������");
			break;
		case "����":
			System.out.println("��������");
			break;
		case "����":
			System.out.println("��������");
			break;
		default:
			System.out.println("������������");
		}
	}
}
