package com.wsx.demo.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileDemo {
	// �ļ�����
	public static void main(String[] args) {
		copyFile("D:/StreamFolder/stream3.txt", "D:/StreamFolder/stream3_copy.txt");
	}

	/*
	 * @param srcPath Դ�ļ�
	 * @param destPath Ŀ���ļ�
	 */
	public static void copyFile(String srcPath, String destPath) {
		File srcFile = new File(srcPath);
		File destFile = new File(destPath);

		// ������һ�ζ�ȡ1024�ֽ�
		byte[] buffer = new byte[1024];

		try (InputStream inputStream = new FileInputStream(srcFile);
				OutputStream outputStream = new FileOutputStream(destFile);) {
			while (true) {
				// ʵ�ʶ�ȡ����actuallyReaded�п���С��1024
				int actuallyReaded = inputStream.read(buffer);
				if (actuallyReaded == -1)
					break;
				outputStream.write(buffer, 0, actuallyReaded);
				outputStream.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
