package com.wsx.demo.stream;

import java.io.File;
import java.sql.Date;

public class FileTest {
	// File�ೣ�÷���
	public static void main(String[] args) {
		// getAbsolutePath(): ���������ļ��У���ȡ�ļ��о���·��
		File f1 = new File("d:/StreamFolder");
		System.out.println("f1�ľ���·����" + f1.getAbsolutePath());
		// getAbsolutePath(): ���������ļ�����ȡ�ļ������ļ��о���·��
		File f2 = new File("stream.txt");
		System.out.println("f2�ľ���·����" + f2.getAbsolutePath());
		// ʹ��f1��Ϊ��Ŀ¼�����ļ�����
		File f3 = new File(f1, "Stream.txt");
		System.out.println("f3�ľ���·����" + f3.getAbsolutePath());
		System.out.println("--------------------------------------------");
		File f = new File("d:/StreamFolder/stream.txt");
		System.out.println("��ǰ�ļ��ǣ�" + f);
		// exists(): �ж��ļ��Ƿ����
		System.out.println("�ļ��ǲ��Ǵ��ڣ�" + f.exists());
		// isDirectory(): �ж��ǲ����ļ���
		System.out.println("�ǲ����ļ��У�" + f.isDirectory());
		// isFile(): �ж��ǲ����ļ�
		System.out.println("�ǲ����ļ���" + f.isFile());
		// length(): �ļ�����
		System.out.println("�ļ����ȣ�" + f.length());
		// lastModified(): �ļ�����޸�ʱ��
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println("�ļ�����޸�ʱ�䣺" + d);
		// setLastModified(time): �����ļ��޸�ʱ��Ϊ1970.1.1 08:00:00
		f.setLastModified(0);
	}	
}
