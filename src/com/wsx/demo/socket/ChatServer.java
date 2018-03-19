package com.wsx.demo.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	// ��������
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			
			System.out.println("�����˿ںţ�8888");
			Socket socket = serverSocket.accept();
			
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				String message = dataInputStream.readUTF();
				System.out.println("�ͻ���˵��" + message);
				System.out.print("����ˣ�");
				Scanner scanner = new Scanner(System.in);
				String line = scanner.next();
				dataOutputStream.writeUTF(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
