package _3_2_serialization.presentation._19_22.serializable;

import java.io.Serializable;

public class Course implements Serializable {
	
	private long id;
	private String name;

	public Course(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
