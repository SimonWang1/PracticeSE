package com.wsx.demo.method_overload;

public class Support extends Hero{
	// �������أ���������ͬ������������ͬ
	public static void main(String[] args) {
		Hero gl = new Hero();
		gl.name = "����";
		Hero sj = new Hero();
		sj.name = "�ͽ�";
		Support slk = new Support();
		slk.name = "������";
		slk.heal();
		slk.heal(sj);
		slk.heal(sj, gl);
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
