package com.wsx.demo.multiple_thread;

public class AnnonymousClassTest {
	// ���̲߳���3
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616;
		garen.damage = 50;
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

		// ʹ��Thread������ʵ�ֶ��߳�
		Thread thread1 = new Thread() {
			// ��run()�б�д�߼�
			public void run() {
				while(!teemo.isDead()) {
					// JDK1.7��ʼ�����ⲿ�ֲ���������ʹ��final����
					garen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		Thread thread2 = new Thread() {
			public void run() {
				while(!leesin.isDead()) {
					ashe.attackHero(leesin);
				}
			}
		};
		thread2.start();
	}
}