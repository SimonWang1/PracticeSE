package com.wsx.chapterdemo5;

public class StaticAccessNonStatic {
	public void info() {
		System.out.println("简单的info方法");
	}
	public static void main(String[] args) {
		//通过类构造器调用方法
		new StaticAccessNonStatic().info();
	}
}
