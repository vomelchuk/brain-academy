package com.labs.lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Cat {
	// fields
	private BufferedReader input;

	// constructors
	public Cat() {
	}

	// methods
	public void printFile(String path) {
		try {
			input = new BufferedReader(new FileReader(path));
			String str;
			while ((str = input.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			System.err.println("Incorrect file!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null)
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

	public static void main(String[] args) {
		Cat cat = new Cat();
		if (args.length == 1) {
			cat.printFile(args[0]);
		} else {
			System.out.println("Usage: java Cat <path_to_file/filename>");
		}
	}

}
