package com.wsx.demo.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PingTest {
	// pingָ�����
	public static void main(String[] args) throws IOException {
		// Runtime.getRuntime().exec()��������windows��exe����
		Process process = Runtime.getRuntime().exec("ping " + "localhost");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = null;
		StringBuilder stringBuilder = new StringBuilder();
		
		while((line = bufferedReader.readLine()) != null) {
			if(line.length() != 0) {
				stringBuilder.append(line + "\r\n");
			}
		}
		
		System.out.println("����ָ��ص���Ϣ�ǣ�");
		System.out.println(stringBuilder.toString());
	}
}
