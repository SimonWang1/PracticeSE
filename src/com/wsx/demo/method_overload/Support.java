package com.wsx.demo.method_overload;

public class Support extends Hero{
	// �������أ���������ͬ������������ͬ
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		Hero syndra = new Hero();
		syndra.name = "������";
		Support soraka = new Support();
		soraka.name = "������";
		soraka.heal();
		soraka.heal(syndra);
		soraka.heal(syndra, garen);
	}
	
	public void heal() {
		System.out.println(name + "ʹ���˻�Ѫ����");
	}
	
	public void heal(Hero h1) {
		System.out.println(name + "�ָ���" + h1.name + "��Ѫ��");
	}
	
	public void heal(Hero h1, Hero h2) {
		System.out.println(name + "�ָ���" + h1.name + "��" + h2.name + "��Ѫ��");
	}
}
