package com.wsx.demo.method_dt1;

public class HeroTest {
	// 测试类
	public static void main(String[] args) {
		// 分别创建英雄对象
		Hero gareen = new ADHero();
		gareen.heroName = "gareen";
		ADHero ashe = new ADHero();
		ashe.heroName = "Ashe";
		APHero teemo = new APHero();
		teemo.heroName = "Teemo";
		ADAPHero caitlyn = new ADAPHero();
		caitlyn.heroName = "Caitlyn";
		// 调用kill方法的同时调用参数对象重写Mortal接口的die方法
		gareen.kill(ashe);
		gareen.kill(teemo);
		gareen.kill(caitlyn);
	}
}
