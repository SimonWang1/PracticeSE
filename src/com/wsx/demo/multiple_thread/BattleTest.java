package com.wsx.demo.multiple_thread;

public class BattleTest {
	// ʵ��Runnable�ӿ�ʵ�ֶ��̲߳���
	public static void main(String[] args) {
		Hero garen = new Hero("����", 616, 50);
		Hero teemo = new Hero("��Ī", 300, 30);
		Hero leesin = new Hero("����", 455, 40);
		Hero ashe = new Hero("��ϣ", 320, 70);
		// ����ʵ��Runnable�ӿ������
		Battle battle1 = new Battle(garen, teemo);
		// ʹ��Runnableʵ�ֶ��߳�ʱ�贴���̶߳������start()
		new Thread(battle1).start();
		// ��ʹ������
		new Thread(new Battle(ashe, leesin)).start();
	}
}
