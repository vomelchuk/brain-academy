package com.labs.lab1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileList {
	// fields
	private File path;

	// constructors
	public FileList() {
		this.path = new File(System.getProperty("user.dir"));
	}

	public FileList(String path) {
		this.path = new File(path);
	}

	// methods
	public void print() {
		if (path.isDirectory()) {
			printFiles(path, "");
		} else {
			printFiles(path.getParentFile(), "");
		}
	}

	private void printFiles(File folder, String sep) {
		File[] files = folder.listFiles();
		for (File file : files) {
			System.out.println(sep + file.getName());
			if (file.isDirectory()) {
				printFiles(file, sep + "  ");
			}
		}
	}

	private static void usage() {
		System.err.println("Incorrect file or directory!");
	}

	public static void main(String[] args) {
		FileList fileList;
		if (args.length == 1) {
			if (!Files.exists(Paths.get(args[0]))) {
				usage();
				return;
			}
			fileList = new FileList(args[0]);
		} else {
			fileList = new FileList();
		}
		System.out.println("Target directory consist such file system:\n");
		fileList.print();
	}
}
