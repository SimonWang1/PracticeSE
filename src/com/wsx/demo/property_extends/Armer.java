package com.wsx.demo.property_extends;

public class Armer extends Item{
	// �̳�ʵ�ִ��븴��
	public int ac;
	public static void main(String[] args) {
		// �������ֱ�ӵ��ø������������ԣ���������չ�ӿ�
		Armer bj = new Armer();
		bj.name = "����";
		bj.price = 300;
		bj.ac = 15;
		Armer szj = new Armer();
		szj.name = "���Ӽ�";
		szj.price = 500;
		szj.ac = 40;
		System.out.println(bj.name + "  " + bj.price + "  " + bj.ac);
		System.out.println(szj.name + "  " + szj.price + "  " + szj.ac);
	}
}
