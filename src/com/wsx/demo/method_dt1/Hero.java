package com.wsx.demo.method_dt1;

public class Hero {
	public String heroName;
	public float HP;

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

	// �β�ע��ӿڣ�ʵ�ֶ�̬
	public void kill(Mortal m) {
		System.out.println(heroName + " used skill 'R'");
		m.die();
	}
}
