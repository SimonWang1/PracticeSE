package com.wsx.demo.method_abstract;

public class ADHero extends Hero implements AD{
	// ����Ӣ��
	@Override
	public void attack() {
		physicAttack();
	}
	
	@Override
	public void physicAttack() {
		System.out.println(this.name + " used physic attack");
	}
}
