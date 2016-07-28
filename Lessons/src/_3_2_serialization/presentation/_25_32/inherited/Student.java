package _3_2_serialization.presentation._25_32.inherited;

import java.io.Serializable;

public class Student extends Pearson implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public Student(String fn, String ln, int a) {
		super(fn, ln);
		this.age = a;
		System.out.println("Constructor");

	}
}
