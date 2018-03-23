package com.wsx.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImp implements ItemDAO {
	// CRUDʵ����
	// ���
	@Override
	public void add(Item item) {
		String sql = "insert into item values(null, ?, ?)";
		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql);) {
			preparedStatement.setString(1, item.name);
			preparedStatement.setInt(2, item.price);
			preparedStatement.execute();
			ResultSet resultSet = preparedStatement.getGeneratedKeys();
			if (resultSet.next()) {
				int id = resultSet.getInt(1);
				item.id = id;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �޸�
	@Override
	public void update(Item item) {
		String sql = "update item set name = ?, price = ? where id = ?";
		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql);) {
			preparedStatement.setString(1, item.name);
			preparedStatement.setInt(2, item.price);
			preparedStatement.setInt(3, item.id);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ɾ��
	@Override
	public void delete(int id) {
		String sql = "delete from item where id = " + id;
		try (Statement statement = getConnection().createStatement();) {
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// ��ȡ����
	@Override
	public Item get(int id) {
		Item item = null;
		String sql = "select * from item where id = " + id;
		try (Statement statement = getConnection().createStatement();) {
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				item = new Item();
				String name = resultSet.getString(2);
				int price = resultSet.getInt(3);
				item.name = name;
				item.price = price;
				item.id = id;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return item;
	}

	// ʹ�÷�ҳ��ѯ����
	@Override
	public List<Item> list() {
		return list(0, Short.MAX_VALUE);
	}

	// ��ҳ��ѯ
	@Override
	public List<Item> list(int start, int count) {
		List<Item> items = new ArrayList<>();
		String sql = "select * from item order by id desc limit ?, ?";
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql);){
			preparedStatement.setInt(1, start);
			preparedStatement.setInt(2, count);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Item item = new Item();
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int price = resultSet.getInt(3);
				item.name = name;
				item.price = price;
				item.id = id;
				items.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return items;
	}

	// ��������ʱ��������
	public ItemDAOImp() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ��ȡ����
	private static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/how2j?" + "charactorEncoding=UTF-8", "root",
				"123456");
	}
}
