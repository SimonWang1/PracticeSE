package com.wsx.demo.multiple_thread;

public class PriorityTest2 {
	// �߳����ȼ�����2
	public static void main(String[] args) {
		P_Hero gareen = new P_Hero();
		gareen.name = "����";
		gareen.hp = 6160;
		gareen.damage = 1;
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
					gareen.attackHero(teemo);
				}
			}
		};
		
		Thread thread2 = new Thread() {
			public void run() {
				while(!leesin.isDead()) {
					// ���ʹ��߳����ȼ����������߳�����
					Thread.yield();
					ashe.attackHero(leesin);
				}
			}
		};
		
		thread1.setPriority(5);
		thread2.setPriority(5);
		thread1.start();
		thread2.start();
	}
}
