package com.wsx.demo.multiple_thread;

public class HeroTest {
	// ���̲߳���
	public static void main(String[] args) {
		Hero garen = new Hero("����", 616, 50);
		Hero teemo = new Hero("��Ī", 300, 30);
		Hero leesin = new Hero("����", 455, 40);
		Hero ashe = new Hero("��ϣ", 320, 70);
		
		while (!teemo.isDead()) {
			garen.attackHero(teemo);
		}
		
		while (!leesin.isDead()) {
			ashe.attackHero(leesin);
		}
	}
}
