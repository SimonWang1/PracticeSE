package com.wsx.fibonaccisequence;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value of n��");
		int i = scan.nextInt();
		System.out.println("F(" + i + ") = " + Fibonacci(i));
	}

	// 쳲������ݹ�
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
