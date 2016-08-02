package _3_3_database_connectivity.common.presentation.driver_manager_and_connection.students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentsDB {
	
	private static final String DB_DRIVER;
	private static final String DB_CONNECTION;
	private static final String DB_USER;
	private static final String DB_PASSWORD;
	
	private static Connection connection = null;
	
	static {
		DB_DRIVER = "org.h2.Driver";
		DB_CONNECTION = "jdbc:h2:tcp://localhost/~/students";
		DB_USER = "sa";
		DB_PASSWORD = "sa";
	}
	
	public static void studentsDBDemo() {
		create();
		clear();
		System.out.println("\t\tIndertion:\n");
		insert(new Student("Mykola", "Vyhylyas", 1.9));
		insertWithPrepStmt(new Student("Arsen", "Zbruyko", 2.0));
		insert(new Student("Zoryana", "Perepelytsya", 1.5));
		print();
		System.out.println("\n\t\tChanging:\n");
		newValue(1, new Student("Orest", "Dzvenyghora", 1.8));
		print();
		System.out.println("\n\t\tDeleting:\n");
		delete(getDBLastID());
		printWithMetaData();
		System.out.println("\n\t\tChanging with accepting:\n");
		acceptChanges(1, new Student("Yevgen", "Konovalets", 2.0));
		print();
	}
	
	private static void create() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "DROP TABLE IF EXISTS STUDENTS;" +
                         "CREATE TABLE STUDENTS("
                                         + "ID INT PRIMARY KEY, "
                                         + "FIRSTNAME VARCHAR(255),"
                                         + "LASTNAME VARCHAR(255),"
                                         + "RATE DOUBLE);";
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
	
	private static void insert(final Student student) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "INSERT INTO STUDENTS " + 
			             "(ID, FIRSTNAME, LASTNAME, RATE)" + 
					     "values ('" + (getDBLastID() + 1) + "'" +
					              ", '" + student.getFirstName() + "'" +
					              ", '" + student.getLastName() + "'" +
					              ", '" + student.getRate() + "')";
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
	
	private static void insertWithPrepStmt(final Student student) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);
			
			String str = "INSERT INTO STUDENTS "
					+ "( ID, FIRSTNAME, LASTNAME, RATE)"
					+ " VALUES(?, ?, ?, ?);";
			try(PreparedStatement ps = connection.prepareStatement(str)){
				ps.setLong(1, getDBLastID() + 1);
				ps.setString(2, student.getFirstName());
				ps.setString(3, student.getLastName());
				ps.setDouble(4, student.getRate());
				ps.executeUpdate();
				} catch(SQLException e) {
					e.printStackTrace();
				}
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

			String sql = "DELETE FROM STUDENTS WHERE ID=" + ID; 
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
	
	private static void newValue(final int ID, final Student student) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);

			Statement stmt = connection.createStatement();

			String sql = "UPDATE STUDENTS SET "
					+ "FIRSTNAME='" + student.getFirstName() + "', "
					+ "LASTNAME='" + student.getLastName() + "', "
					+ "RATE='" + student.getRate() + "' " +
					"WHERE ID=" + ID; 
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
	
	private static void acceptChanges(final int ID, final Student student) {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);
			connection.setAutoCommit(false);
			Statement stmt = connection.createStatement();

			String sql = "UPDATE STUDENTS SET FIRSTNAME='" + 
			             student.getFirstName() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
			sql = "UPDATE STUDENTS SET LASTNAME='" + 
			      student.getLastName() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
			sql = "UPDATE STUDENTS SET RATE='" + 
				      student.getRate() + "' WHERE ID=" + ID; 
			stmt.executeUpdate(sql);
			
			if(askForAcceptChanges())
				connection.commit();
			else
				connection.rollback();
			
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

			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS ");
			System.out.printf("%-5s%-15s%-15s%-15s%n%n",
					          "ID", "FIRSTNAME", "LASTNAME", "RATE");
			while (rs.next())
				System.out.printf("%-5s%-15s%-15s%-15s%n",
						           rs.getString("ID"), 
			                       rs.getString("FIRSTNAME"),
			                       rs.getString("LASTNAME"),
			                       rs.getString("RATE"));
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
	
	private static void printWithMetaData() {
		try {
			Class.forName(DB_DRIVER);
			connection = DriverManager.getConnection(DB_CONNECTION, 
					                                 DB_USER, DB_PASSWORD);
			
			try(Statement st = connection.createStatement()) {
				ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS;");
				ResultSetMetaData md = rs.getMetaData();
				for (int i = 1; i <= md.getColumnCount(); i++) {
					if(i == 1)
						System.out.printf("%-5s", md.getColumnName(i));
					else
						System.out.printf("%-15s", md.getColumnName(i));
				}
				System.out.println("\n");
				while (rs.next()) {
					for (int i = 1; i <= md.getColumnCount(); i++) {
						if(i == 1)
							System.out.printf("%-5s", rs.getString(i));
						else
							System.out.printf("%-15s", rs.getString(i));
					}
					System.out.println();
				}
				} catch (SQLException e) {
				}

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

			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS ");
			
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
	
	private static boolean askForAcceptChanges() {
		System.out.println("Do you want add changes to DB? yes/no");
		Scanner sc = new Scanner(System.in);
		String answer = sc.nextLine().toLowerCase();
		sc.close();
		switch(answer) {
		case "yes": {
			System.out.println();
			return true;
		}
		case "no": {
			System.out.println();
			return false;
		}
		default: {
			System.out.println("Incorrect value passed! Changes declined!\n");
			return false; 
		}
		}
	}
}
