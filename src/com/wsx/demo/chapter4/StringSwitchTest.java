package com.wsx.demo.chapter4;

import java.util.Scanner;

public class StringSwitchTest {
	// Switch判断
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("请输入季节：");
			String season = sc.nextLine();
			switch (season) {
			case "春天":
				System.out.println("春天来了");
				break;
			case "夏天":
				System.out.println("夏天来了");
				break;
			case "秋天":
				System.out.println("秋天来了");
				break;
			case "冬天":
				System.out.println("冬天来了");
				break;
			default:
				System.out.println("季节输入有误");
			}
		}
	}
}
