package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionPoolTest {
	// �Զ������ӳز���
	public static void main(String[] args) {
		// ���ӳس�ʼ��3������
		ConnectionPool connectionPool = new ConnectionPool(3);
		// ��ʼ��100���߳������ӳ���������
		for(int i = 0; i < 100; i++) {
			new WorkingThread("working thread " + i, connectionPool).start();
		}
	}
}

class WorkingThread extends Thread{
	// ���������߳���
	private ConnectionPool connectionPool;
	
	public void run() {
		Connection connection = connectionPool.getConnection();
		System.out.println(this.getName() + "����ȡ��һ�����ӣ�����ʼ����");
		try(Statement statement = connection.createStatement();){
			// ģ���ʱ1���SQL���
			Thread.sleep(1000);
			statement.executeQuery("select * from hero");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		connectionPool.returnConnection(connection);
	}
	
	public WorkingThread(String name, ConnectionPool connectionPool) {
		super(name);
		this.connectionPool = connectionPool;
	}
}
