package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcpetionTest {
	// �ļ��������쳣
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		File f = new File("d:\\stream.txt");
		try {
			System.out.println("��ͼ�� d:\\stream.txt");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("�ļ�������");
			e.printStackTrace();
		}
	}
}
