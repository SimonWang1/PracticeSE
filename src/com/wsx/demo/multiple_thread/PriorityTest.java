package com.wsx.demo.multiple_thread;

public class PriorityTest {
	// �߳����ȼ�����
	public static void main(String[] args) {
		P_Hero garen = new P_Hero();
		garen.name = "����";
		// Ϊ����۲����ȼ�����hp x 10��damage ��Ϊ1
		garen.hp = 6160;
		garen.damage = 1;
		P_Hero teemo = new P_Hero();
		teemo.name = "��Ī";
		teemo.hp = 3000;
		teemo.damage = 1;
		P_Hero leesin = new P_Hero();
		leesin.name = "����";
		leesin.hp = 4550;
		leesin.damage = 1;
		P_Hero ashe = new P_Hero();
		ashe.name = "��ϣ";
		ashe.hp = 3200;
		ashe.damage = 1;

		Thread thread1 = new Thread() {
			public void run() {
				while(!teemo.isDead()) {
					garen.attackHero(teemo);
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				while(!leesin.isDead()) {
					ashe.attackHero(leesin);
				}
			}
		};
		
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.start();
		thread2.start();
	}
}
