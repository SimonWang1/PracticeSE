package com.wsx.demo.chapter4;

import java.util.Scanner;

public class StringSwitchTest {
	// Switch�ж�
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�����뼾�ڣ�");
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
}
