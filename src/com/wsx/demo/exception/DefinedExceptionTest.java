package com.wsx.demo.exception;

public class DefinedExceptionTest {
	// �Զ����쳣����
	public static void main(String[] args) {
		Hero gareen = new Hero();
		gareen.name = "gareen";
		gareen.hp = 666;
		Hero teemo = new Hero();
		teemo.name = "teemo";
		teemo.hp = 0;
		try {
			gareen.attackHero(teemo);
		} catch (DefinedException e) {
			System.out.println("�쳣����ԭ��" + e.getMessage());
			e.printStackTrace();
		}
	}
}
