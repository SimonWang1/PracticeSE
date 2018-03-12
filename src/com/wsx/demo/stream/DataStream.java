package com.wsx.demo.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStream {
	// DataStream������
	public static void main(String[] args) {
		write();
		read();
	}
	
	private static void write() {
		try(OutputStream outputStream = new FileOutputStream("D:/StreamFolder/data stream"); 
			DataOutputStream dataOutputStream = new DataOutputStream(outputStream);){
			dataOutputStream.writeInt(123);
			dataOutputStream.writeBoolean(true);
			dataOutputStream.writeUTF("Hello, guys! ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DataInputSteam��ȡ���ļ�������DataOutputSteamд���ģ�����ᱨ��
	private static void read() {
		try(InputStream inputStream = new FileInputStream("D:/StreamFolder/data stream");
			DataInputStream dataInputStream = new DataInputStream(inputStream);){
			System.out.println("��ȡ����ֵ��" + dataInputStream.readInt());
			System.out.println("��ȡ����ֵ��" + dataInputStream.readBoolean());
			System.out.println("��ȡ�ַ�����" + dataInputStream.readUTF());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
