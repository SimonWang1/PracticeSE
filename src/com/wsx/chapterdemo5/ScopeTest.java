package com.wsx.chapterdemo5;

public class ScopeTest {
	//定义类成员变量i
	static int i;
	public static void main(String[] args) {
		for(i = 0; i < 1; i++) {
			System.out.println("类成员变量为全局变量，在堆中定义，GC回收，影响性能");
		}
		//定义方法局部变量j
		int j;
		for(j = 0; j < 2; j++) {
			System.out.println("方法局部变量在栈中定义，代码块结束即回收，性能较好");
		}
		//定义代码块局部变量k
		for(int k = 0; k < 3; k++) {
			System.out.println("代码块局部变量在栈中定义，变量k在循环体内有效，符合开发规范");
		}
	}
}
