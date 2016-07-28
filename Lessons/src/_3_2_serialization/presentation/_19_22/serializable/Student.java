package _3_2_serialization.presentation._19_22.serializable;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private int age;
	private Course course;

	public Student(String fn, String ln, int a) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = a;
		System.out.println("Constructor");
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}	
}
