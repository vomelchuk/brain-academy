package module2.oop2_5.labs.lab5;

import java.util.Random;

public class InitTest {
	// fields
	private int id;
	private static int nextId;

	static {
		Random random = new Random();
		int START = 0, END = 1000;
		nextId = random.nextInt(END - START + 1) + START;
	}

	// constructors
	public InitTest() {
		this.id = nextId;
		nextId++;
	}

	// accessors 	
	public int getId() {
		return id;
	}

}
