package com.wsx.demo.method_dt1;

public class HeroTest {
	// ������
	public static void main(String[] args) {
		// �ֱ𴴽�Ӣ�۶���
		Hero gareen = new ADHero();
		gareen.heroName = "gareen";
		ADHero ashe = new ADHero();
		ashe.heroName = "Ashe";
		APHero teemo = new APHero();
		teemo.heroName = "Teemo";
		ADAPHero caitlyn = new ADAPHero();
		caitlyn.heroName = "Caitlyn";
		// ����kill������ͬʱ���ò���������дMortal�ӿڵ�die����
		gareen.kill(ashe);
		gareen.kill(teemo);
		gareen.kill(caitlyn);
	}
}
