package com.wsx.demo.multiple_thread;

public class AnnonymousClassTest {
	// ��������߳�
	public static void main(String[] args) {
		Hero garen = new Hero("����", 616, 50);
		Hero teemo = new Hero("��Ī", 300, 30);
		Hero leesin = new Hero("����", 455, 40);
		Hero ashe = new Hero("��ϣ", 320, 70);
		
		// Thread������ʵ�ֶ��߳�
		Thread thread1 = new Thread() {
			public void run() {
				while (!teemo.isDead()) {
					garen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		// ��ʹ������
		new Thread() {
			public void run() {
				while (!leesin.isDead()) {
					ashe.attackHero(leesin);
				}
			}
		}.start();
		
		// Runnable������ʵ�ֶ��߳�
		Runnable runnable = new Runnable() {
			public void run() {
				while (!ashe.isDead()) {
					teemo.attackHero(ashe);
				}
			}
		};
		Thread thread3 = new Thread(runnable);
		thread3.start();
		
		// ��ʹ������
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (!ashe.isDead()) {
					teemo.attackHero(ashe);
				}
			}
		}).start();
		
		// Lambda���ʽ
		new Thread(() -> {
			while (!teemo.isDead()) {
				ashe.attackHero(teemo);
			}
		}).start();
	}
}
