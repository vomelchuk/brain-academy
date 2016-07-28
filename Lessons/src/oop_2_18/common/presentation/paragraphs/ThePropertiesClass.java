package oop_2_18.common.presentation.paragraphs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ThePropertiesClass {

	/*
	 * Paragraph: The Properties Class. 
	 * Slides: 33-38
	 */
	public static void demo() {
		thePropertiesClass37();
	}

	/*
	 * Slide # 37: Getting the current system data base local host information
	 */
	private static void thePropertiesClass37() {
		Properties property = new Properties();
		try (FileInputStream fis = new FileInputStream("config.properties")) {
			property.load(fis);
			String host = property.getProperty("dbhost");
			String login = property.getProperty("dblogin");
			String password = property.getProperty("dbpassword");
			System.out.println("HOST: " + host + ", "
					         + "LOGIN: " + login + ", PASSWORD: " + password);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
