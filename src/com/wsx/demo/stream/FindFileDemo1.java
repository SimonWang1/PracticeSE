package com.wsx.demo.stream;

import java.io.File;

public class FindFileDemo1 {
	// ʹ�õݹ����ָ���ļ��а������ļ��е������С�ļ�
	static long minSize = Integer.MAX_VALUE;
	static long maxSize = 0;
	static File minFile = null;
	static File maxFile = null;
	
	public static void main(String[] args) {
		File file = new File("E:/downloads");
		listFiles(file);
		System.out.format("����ļ��� %s ����С�� %d �ֽ�%n", 
				maxFile.getAbsolutePath(), maxFile.length());
		System.out.format("��С�ļ��� %s ����С�� %d �ֽ�%n",
				minFile.getAbsolutePath(), minFile.length());
	}
	
	private static void listFiles(File file) {
		if(file.isFile()) {
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize) {
				minSize = file.length();
				minFile = file;
			}
		}
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			if(files != null) {
				for(File f : files) {
					// �ݹ����
					listFiles(f);
				}
			}
		}
	}
}
