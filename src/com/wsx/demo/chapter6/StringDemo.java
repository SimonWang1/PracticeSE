package com.wsx.demo.chapter6;

import java.util.Scanner;

public class StringDemo {
	// String��ʽ��
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������");
		String location = sc.nextLine();
		System.out.println("�����빫˾���ͣ�");
		String companyType = sc.nextLine();
		System.out.println("�����빫˾���ƣ�");
		String companyName = sc.nextLine();
		System.out.println("�������ϰ�������");
		String bossName = sc.nextLine();
		System.out.println("�������");
		String money = sc.nextLine();
		System.out.println("�������Ʒ���ƣ�");
		String product = sc.nextLine();
		System.out.println("�����뵥λ��");
		String unit = sc.nextLine();
		System.out.println(location + "���" + companyType + companyName + "�����ˣ����˵��ϰ�"
				+ bossName + "�Ժ��ζģ�Ƿ��" + money + "���ڣ���������С�������ˣ�");
		System.out.println("����û�а취������" + product + "�ֹ��ʣ�ԭ��һ" + unit + "�࣬��" +
				unit + "���" + product + "������ȫ��ֻҪ��ʮ�飡");
		System.out.println(bossName + "���˵����㲻���ˣ�����������������˴���꣬�㲻�����ʣ��㻹��"
				+ "Ѫ��Ǯ������Ѫ��Ǯ��");
	}
}
