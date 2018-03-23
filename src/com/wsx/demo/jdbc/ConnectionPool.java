package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	// �Զ������ӳ�
	// ��ʼ����������
	int size;
	// �������ӳأ������ӷ���List����
	List<Connection> connectionPool = new ArrayList<>();
	
	// ��ʼ������
	public void init() {
		// ���ӳ�����������ر�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			for(int i = 0; i < size; i++) {
				Connection connection = DriverManager.
						getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root", "123456");
				connectionPool.add(connection);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// ��ȡ����
	public synchronized Connection getConnection() {
		// ���޿����̣߳����������̵߳ȴ�
		while(connectionPool.isEmpty()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Connection connection = connectionPool.remove(0);
		return connection;
	}
	
	// �����߳�
	public synchronized void returnConnection(Connection connection) {
		connectionPool.add(connection);
		// �п����߳�ʱʹ��notifyAll()���Ѵ���wait()״̬�����������߳�
		this.notifyAll();
	}
	
	public ConnectionPool(int size) {
		this.size = size;
		init();
	}
}
