package com.wsx.demo.multiple_thread;

public class KillThreadTest {
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
		
		KillThread killThread1 = new KillThread(gareen, teemo);
		// �߳�startͬʱ�����߳�����run����
		killThread1.start();
		KillThread killThread2 = new KillThread(ashe, leesin);
		killThread2.start();
	}
}
