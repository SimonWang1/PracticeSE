package com.wsx.demo.exception;

public class ErrorTest {
	// Errorָϵͳ������쳣��ͨ��ָ��ջ���
	public static void main(String[] args) {
		// OutOfMemoryError: ���ڴ����
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			sb.append(i);
		}
	}
}
