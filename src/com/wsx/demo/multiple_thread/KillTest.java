package com.wsx.demo.multiple_thread;

public class KillTest {
	// ���̲߳���1
	public static void main(String[] args) {
		Hero gareen = new Hero();
		gareen.name = "����";
		gareen.hp = 616;
		gareen.damage = 50;
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 300;
		teemo.damage = 30;
		Hero leesin = new Hero();
		leesin.name = "����";
		leesin.hp = 455;
		leesin.damage = 40;
		Hero ashe = new Hero();
		ashe.name = "��ϣ";
		ashe.hp = 320;
		ashe.damage = 70;
		
		Kill kill1 = new Kill(gareen, teemo);
		// �߳�startͬʱ�����߳�����run����
		kill1.start();
		Kill kill2 = new Kill(ashe, leesin);
		kill2.start();
	}
}
