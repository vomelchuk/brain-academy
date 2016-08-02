package com.labs.lab3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileCopy {
	// fields
	private String source;
	private String dest;

	// constructors
	public MyFileCopy(String source, String dest) {
		this.source = source;
		this.dest = dest;
	}

	// methods
	private void copy() {
		try (FileInputStream input = new FileInputStream(source);
				FileOutputStream output = new FileOutputStream(dest);) {
			int point;
			while ((point = input.read()) != -1) {
				output.write(point);
			}
			System.out.println(source + " has been copied to " + dest);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MyFileCopy fileCopy;
		if (args.length == 2) {
			if(args[0].equals(args[1])){
				System.out.println("Source and destination files are the same!");
				return;
			}
			fileCopy = new MyFileCopy(args[0], args[1]);
			fileCopy.copy();
		} else {
			System.out.println("Incorrect parameters!\nUsage: java MyFileCopy <source_file> <target_file>");
		}

	}

}
