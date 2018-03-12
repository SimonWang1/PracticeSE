package com.wsx.demo.stream;

import java.io.File;

public class FindFileDemo1 {
	// �ݹ����ָ���ļ��а������ļ��е������С�ļ�
	// �����ļ����ļ�����Ϊ��̬ȫ�ֱ���
	private static File minFile = null;
	private static File maxFile = null;
	private static long minSize = Integer.MAX_VALUE;
	private static long maxSize = 0;
	
	public static void main(String[] args) {
		File file = new File("F:/BaiduNetdiskDownload");
		listFiles(file);
		System.out.format("����ļ��� %s ����С�� %d �ֽ�%n", 
				maxFile.getAbsolutePath(), maxFile.length());
		System.out.format("��С�ļ��� %s ����С�� %d �ֽ�%n",
				minFile.getAbsolutePath(), minFile.length());
	}
	
	// �ݹ����
	private static void listFiles(File file) {
		// �����ļ�
		if(file.isFile()) {
			// �ҵ�����ļ�
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			// �ҵ���Ϊ�����С�ļ�
			if(file.length() != 0 && file.length() < minSize) {
				minSize = file.length();
				minFile = file;
			}
		}
		// �����ļ���
		if(file.isDirectory()) {
			// �����ļ�������
			File[] files = file.listFiles();
			// ����Ϊ��
			if(files != null) {
				// ��������
				for(File f : files) {
					// �ݹ����
					listFiles(f);
				}
			}
		}
	}
}
