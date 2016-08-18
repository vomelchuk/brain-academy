package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDB {
	// fields;
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/shoppingcart";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "rexmktvj";
	private static Connection conn;

	// methods
	public static void insert(String name, float price, float quantity) {
		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			String sql = "insert into goods (name, price, quantity) values ('" + name + "', " + price + ", " + quantity
					+ ")";
			conn.createStatement().executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public static List<Good> select() {
		List<Good> goods = new ArrayList<>();
		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			String sql = "select name, price, quantity from goods";
			ResultSet rs = conn.createStatement().executeQuery(sql);
			while (rs.next()) {
				goods.add(new Good(rs.getString("name"), rs.getFloat("price"), rs.getFloat("quantity")));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return goods;

	}

	public static void delete() {
		try {
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			String sql = "delete from goods";
			conn.createStatement().executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

	public static void update() {

	}

}
