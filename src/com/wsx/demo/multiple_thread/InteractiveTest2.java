package com.wsx.demo.multiple_thread;

public class InteractiveTest2 {
	// �߳̽�������2
	public static void main(String[] args) {
		I_Hero garen = new I_Hero();
		garen.name = "����";
		garen.hp = 767;
		
		Thread thread = new Thread() {
			public void run() {
				while(true) {
					garen.hurt();
					try {
						// ��ѪƵ�ʵͣ�ִ��hurt()ʱ����notify()�����ͬ������wait()�����̵߳ĵȴ�����
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
		Thread thread2  = new Thread() {
			public void run() {
				while(true) {
					garen.recover();
					try {
						// ��ѪƵ�ʸ��ߣ�Ѫ��Ϊ1000ʱִ��wait()���ͷ�ͬ������ռ�е��̲߳��ȴ�
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread2.start();
	}
}
