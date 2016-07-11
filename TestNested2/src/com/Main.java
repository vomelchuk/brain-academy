package com;

public class Main {

	public static void main(String[] args) {
		
		MyTestClass outer = new MyTestClass();
		MyTestClass.MyNestedClass innerStatic = new MyTestClass.MyNestedClass();
		MyTestClass.MyInner innerNoStatic = outer.new MyInner();
		
		
	}

}
