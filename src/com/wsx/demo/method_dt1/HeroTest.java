package com.wsx.demo.method_dt1;

public class HeroTest {
	public static void main(String[] args) {
		// ʹ�ø���������������ֻ�ܷ��ʸ��ඨ��ķ���
		Hero gareen = new ADHero();
		gareen.heroName = "gareen";
		// ʹ�����������������Ϳ��Է�����������з���
		ADHero ashe = new ADHero();
		ashe.heroName = "Ashe";
		APHero teemo = new APHero();
		teemo.heroName = "Teemo";
		ADAPHero caitlyn = new ADAPHero();
		caitlyn.heroName = "Caitlyn";
		gareen.kill(ashe);
		gareen.kill(teemo);
		gareen.kill(caitlyn);
	}
}
