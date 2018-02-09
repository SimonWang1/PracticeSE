package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
	// try catch�������ļ��������쳣
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("d:/stream.txt");
		try {
			// �ɲ��쳣��Ҫ����try catch��throws���������������������ִ��
			System.out.println("��ͼ�� d:/stream.txt");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		}
		// ��ʹ��FileNotFoundException��Ӹ���Exception������������
		// Ҳ����Exception�ĸ���Throwable����
		catch (FileNotFoundException e) {
			System.out.println("�ļ�������");
			// ׷��ջ��ӡ�쳣λ��
			e.printStackTrace();
		}
	}
}
