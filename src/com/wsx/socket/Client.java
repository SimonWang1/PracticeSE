package com.wsx.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException, InterruptedException {
		@SuppressWarnings("resource")
		Socket client = new Socket("localhost", 9999);
		String sk = null;
		do {
			System.out.println("���������������������");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String sn = sc.next();
			client.getOutputStream().write(sn.getBytes());
			do {
				byte bb[] = new byte[client.getInputStream().available()];
				client.getInputStream().read(bb);
				sk = new String(bb);
			} while (sk.equals(""));
			System.out.println("������˵��" + sk);
		} while (true);
	}
}
