package com.wsx.demo.multiple_thread;

public class JoinTest {
	// join()��������
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

		Thread thread1 = new Thread() {
			public void run() {
				while(!teemo.isDead()) {
					gareen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		try {
			// ��thread1���뵽main thread��ֻ����thread1ִ����Ϻ���˳��ִ��thread2
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
