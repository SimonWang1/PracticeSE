package com.wsx.demo.method_dt;

public class Hero {
	public String heroName;
	public float HP;
	public static void main(String[] args) {
		//�ڸ��ഴ������ʱ�������Ϳ��ԺͶ������Ͳ�ͬ
		Hero gareen = new ADHero();
		gareen.heroName = "gareen";
		//�����������ʱ�������ͺͶ�������Ҫ��ͬ
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
	
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		m.die();
	}
}
