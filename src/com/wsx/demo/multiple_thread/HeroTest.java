package com.wsx.demo.multiple_thread;

public class HeroTest {
	// ���̲߳���
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
		
		while(!teemo.isDead()) {
			garen.attackHero(teemo);
		}
		
		while(!leesin.isDead()) {
			ashe.attackHero(leesin);
		}
	}
}
