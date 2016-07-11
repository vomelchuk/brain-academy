package com;

public class MyTestClass {

	public static String staticOuter = "Static outer";
	public String instanceOuter = "Instance outer";

	private void test() {

	}

	public static class MyNestedClass {
		public void printOuter() {
			System.out.println("Access to staticOrder: " + staticOuter);
		}
	}

	public class MyInner {
	}

	public void func() {
		class MyLocal {
		}

	}
}
