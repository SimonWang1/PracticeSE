package com.wsx.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MTChatServer {
	// ���߳���������
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(8888);
			
			System.out.println("�����˿ںţ�8888");
			Socket socket = serverSocket.accept();
			
			// ����������Ϣ�߳�
			new MTSendThread(socket).start();
			
			// ����������Ϣ�߳�
			new MTRecieveThread(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
