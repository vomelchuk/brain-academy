package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GoodsDB {

	private static final String DB_DRIVER = "org.h2.Driver";
	private static final String DB_CONNECTION = "jdbc:h2:tcp://localhost/~/GoodsDB";
	private static final String DB_USER = "sa";
	private static final String DB_PASSWORD = "sa";
	private static Connection connection = null;

	public void insert(final String name, float price, float weight) {
		try {
			
			Class.forName(DB_DRIVER);
			
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "INSERT INTO GOODS " + "(ID, NAME, PRICE, WEIGHT)" + " values (" + (getDBLastID() + 1) + ", '"
					+ name + "', " + price + ", " + weight + ")";
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void print() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM GOODS ");
			System.out.println("ID\tNAME\tPRICE\tWEIGHT");
			while (rs.next())
				System.out.println(rs.getInt("ID") + "\t" + rs.getString("NAME") + "\t" + rs.getFloat("PRICE") + "\t"
						+ rs.getFloat("WEIGHT"));
			System.out.println();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static int getDBLastID() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM Goods ");

			int counter = 0;
			while (rs.next())
				++counter;

			return counter;

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
}
