package com.wsx.algorithm;

import java.util.Scanner;

public class FibonacciSequence {
	// �ݹ�ʵ��쳲�����
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value of n��");
		int i = scan.nextInt();
		System.out.println("F(" + i + ") = " + Fibonacci(i));
	}

	public static int Fibonacci(int n) {
		// ��������
		if (n == 0) {
			return 0;
		}
		else if (n <= 2) {
			return 1;
		}
		// �ݹ�����
		else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
