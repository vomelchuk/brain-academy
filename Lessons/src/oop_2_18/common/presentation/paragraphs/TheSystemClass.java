package oop_2_18.common.presentation.paragraphs;

import java.io.IOException;
import java.util.Map;

public class TheSystemClass {
	
	/*
	 * Paragraph: The System Class. 
	 * Slides: 28-32
	 */
	public static void demo() {
		//theSystemClass30();
//		theSystemClass31();
		theSystemClass32();
	}

	/* Slide # 30: System Class static constant Streams:
	 *             err, out, in
	 */
	private static void theSystemClass30() {
		//static PrintStream err
		//The "standard" error output stream
		System.err.println("error output stream");
		//static PrintStream out
		//The "standard" output stream:
		System.out.println("\"standard\"output stream");
		//static InputStream in
		//The "standard" input stream
		int c = 0;
		try {
			c = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
	
	/* Slide # 31: System Class getenv() method: returns the set of the current 
	 *             system environment variables
	 */
	private static void theSystemClass31() {
		Map<String, String> env = System.getenv();
		for (String envName : env.keySet())
			System.out.format("%s=%s%n%n", envName, env.get(envName));
	}
	
	/* Slide # 32: System Class getenv(String name) method: returns the specific 
	 *             environment variable of the current system
	 */
	private static void theSystemClass32() {
		//environment variable "PATH"
		System.out.println("PATH = " + System.getenv("PATH"));
		//environment variable "TEMP"
		System.out.println("TEMP = " + System.getenv("TEMP"));
		//environment variable "USERNAME"
		System.out.println("USERNAME = " + System.getenv("USERNAME"));
	}
}
