package com.wsx.demo.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManyException2 {
	// ���쳣��׽2
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		File f = new File("d:\\stream.txt");
		try {
			System.out.println("��ͼ��d:\\stream.txt");
			new FileInputStream(f);
			System.out.println("�ɹ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
			Date d = sdf.parse("2018-02-08");
		} 
		// ��׽�쳣��Ϣͳһ�����β��У���Ҫinstance of�ж�
		catch (FileNotFoundException | ParseException e) {
			if(e instanceof FileNotFoundException)
				System.out.println("�ļ�������");
			if(e instanceof ParseException)
				e.printStackTrace();
			System.out.println("���ڸ�ʽ��������");
		}
	}
}