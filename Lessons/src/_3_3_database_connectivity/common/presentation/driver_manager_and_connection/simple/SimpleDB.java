package _3_3_database_connectivity.common.presentation.driver_manager_and_connection.simple;

import static _3_3_database_connectivity.common.presentation.driver_manager_and_connection.students.StudentsDB.studentsDBDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleDB {
	
	private static final String DB_DRIVER;
	private static final String DB_CONNECTION;
	private static final String DB_USER;
	private static final String DB_PASSWORD;
	
	private static Connection connection = null;
	
	static {
		DB_DRIVER = "org.h2.Driver";
		DB_CONNECTION = "jdbc:h2:tcp://localhost/~/test";
		DB_USER = "sa";
		DB_PASSWORD = "sa";
	}
	
	public static void simpleDBDemo() {
		clear();
		insert("Aloha");
		insert("Hi");
		insert("Hola");
		print();
		delete(getDBLastID());
		print();
		newValue(1, "Hello");
		print();
	}
	
	private static void insert(final String VALUE) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "INSERT INTO TEST " + 
			             "(ID, NAME)" + 
					     "values ('" + (getDBLastID() + 1) + 
					              "', '" + VALUE + "')";
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
	
	private static void delete(final int ID) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "DELETE FROM TEST WHERE ID=" + ID; 
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
	
	private static void newValue(final int ID, final String VALUE) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "UPDATE TEST SET NAME='" + VALUE + "' WHERE ID=" + ID; 
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
	
	private static void clear() {
		while(getDBLastID() > 0)
			delete(getDBLastID());
	}
	
	private static void print() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM TEST ");
			System.out.println();
			while (rs.next())
				System.out.println(rs.getString("ID") + "\t" + 
			                              rs.getString("NAME"));
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
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM TEST ");
			
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
