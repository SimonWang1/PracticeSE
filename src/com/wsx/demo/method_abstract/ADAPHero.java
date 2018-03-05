package com.wsx.demo.method_abstract;

public class ADAPHero extends Hero implements AD, AP {
	// ���̳ж�ʵ��
	// ���ϵӢ��
	@Override
	public void attack() {
		physicAttack();
		magicAttack();
	}

	@Override
	public void physicAttack() {
		System.out.println(this.name + " used Physic Attrack");
	}

	@Override
	public void magicAttack() {
		System.out.println(this.name + " used Magic Attrack");
	}
}
