package com.wsx.demo.stream;

import java.io.File;

public class FindFile {
	// ����ָ���ļ��в��������ļ��е������С�ļ�
	public static void main(String[] args) {
		long minSize = Integer.MAX_VALUE;
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		File f = new File("C:/windows");
		File[] files = f.listFiles();
		if(files == null)
			return;
		for(File file : files) {
			if(file.isDirectory())
				continue;
			if(file.length() > maxSize) {
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize) {
				minSize = file.length();
				minFile = file;
			}
		}
		System.out.format("����ļ��� %s ����СΪ %d �ֽ�%n", maxFile.getAbsolutePath(), maxSize);
		System.out.format("��С�ļ��� %s ����СΪ %d �ֽ�%n", minFile.getAbsolutePath(), minSize);
	}
}
