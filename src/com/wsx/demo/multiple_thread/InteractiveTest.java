package com.wsx.demo.multiple_thread;

public class InteractiveTest {
	// �߳̽�������
	public static void main(String[] args) {
		I_Hero tryndamere = new I_Hero();
		tryndamere.name = "̩���׶�";
		tryndamere.hp = 767;
		
		Thread thread = new Thread() {
			public void run() {
				while(true) {
					tryndamere.hurt();
					try {
						// ��ѪƵ�ʸ��ߣ�Ѫ��Ϊ1ʱִ��wait()���ͷ�ͬ������ռ�е��̲߳��ȴ�
						Thread.sleep(10);
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
					tryndamere.recover();
					try {
						// ��ѪƵ�ʵͣ�ִ��recover()ʱ����notify()�����ͬ������wait()�����̵߳ĵȴ�����
						Thread.sleep(100);
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
