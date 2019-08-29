package com.wsx.demo.multiple_thread;

public class JoinTest {
	// join()��������
	public static void main(String[] args) {
		Hero garen = new Hero("����", 616, 50);
		Hero teemo = new Hero("��Ī", 300, 30);
		Hero leesin = new Hero("����", 455, 40);
		Hero ashe = new Hero("��ϣ", 320, 70);

		Thread thread1 = new Thread() {
			public void run() {
				while(!teemo.isDead()) {
					garen.attackHero(teemo);
				}
			}
		};
		thread1.start();
		
		try {
			// ��thread1 join��main thread��ֻ����thread1ִ����Ϻ���˳��ִ��thread2
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
