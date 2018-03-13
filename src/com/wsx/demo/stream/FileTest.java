package com.wsx.demo.stream;

import java.io.File;
import java.sql.Date;

public class FileTest {
	// File�ೣ�÷���
	public static void main(String[] args) {
		// getAbsolutePath(): ���������ļ��У���ȡ�ļ��о���·��
		File file1 = new File("d:/StreamFolder");
		System.out.println("file1�ľ���·����" + file1.getAbsolutePath());
		// getAbsolutePath(): ���������ļ�����ȡ�ļ������ļ��о���·��
		File file2 = new File("stream.txt");
		System.out.println("file2�ľ���·����" + file2.getAbsolutePath());
		// ʹ��f1��Ϊ��Ŀ¼�����ļ�����
		File file3 = new File(file1, "Stream.txt");
		System.out.println("file3�ľ���·����" + file3.getAbsolutePath());
		System.out.println("--------------------------------------------");
		File file = new File("d:/StreamFolder/stream.txt");
		System.out.println("��ǰ�ļ��ǣ�" + file);
		// exists(): �ж��ļ��Ƿ����
		System.out.println("�ļ��ǲ��Ǵ��ڣ�" + file.exists());
		// isDirectory(): �ж��ǲ����ļ���
		System.out.println("�ǲ����ļ��У�" + file.isDirectory());
		// isFile(): �ж��ǲ����ļ�
		System.out.println("�ǲ����ļ���" + file.isFile());
		// length(): �ļ�����
		System.out.println("�ļ����ȣ�" + file.length());
		// lastModified(): �ļ�����޸�ʱ��
		long time = file.lastModified();
		Date date = new Date(time);
		System.out.println("�ļ�����޸�ʱ�䣺" + date);
		// setLastModified(time): �����ļ��޸�ʱ��Ϊ1970.1.1 08:00:00
		file.setLastModified(0);
	}	
}
