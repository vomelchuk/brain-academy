package _3_1_iostreams.common.labs._3_1_1;

import java.io.*;

public class FilesList {

	private File absoluteDirectory;
	private Class currentClass;

	{
		absoluteDirectory = new File(new File(".").getAbsolutePath());
	}

	public FilesList() {
		currentClass = this.getClass();
	}

	public FilesList(Class currentClass) {
		this.currentClass = currentClass;
	}

	public FilesList(File customFile) {
		this.absoluteDirectory = customFile;
	}

	public void printFilesList() {
		System.out.println("\n\tTarget Directory file's list:\n");
		if (currentClass != null)
			classDirContent(absoluteDirectory, currentClass);
		else
			fileDirContent();
		System.out.println();
	}

	private void classDirContent(File current, Class targetClass) {
		File[] paths = current.listFiles();
		for (File path : paths) {
			if (path.isDirectory()) {
				classDirContent(path, targetClass);
			}
			if (path.getName().equals(targetClass.getSimpleName() + ".class")) {
				simpleFileWalker(current, "");
			}
		}
	}

	private void fileDirContent() {
		if (absoluteDirectory.isDirectory())
			simpleFileWalker(absoluteDirectory, "");
		else
			simpleFileWalker(absoluteDirectory.getParentFile(), "");
	}

	private void simpleFileWalker(File current, String separator) {
		if (current.isDirectory()) {
			File[] paths = current.listFiles();
			for (File path : paths) {
				System.out.println(separator + path.getName());
				if (path.isDirectory()) {
					simpleFileWalker(path, separator + "    ");
				}
			}
		}
	}

	public static void main(String[] args) {
		FilesList filesList = null;
		try {
			filesList = new FilesList(new File(args[0]));
		} catch (Exception e) {
			System.out.println("Invalid file path passed!\n" + "Path instantiated to FilesList.class parent file");
			filesList = new FilesList();
		}
		filesList.printFilesList();

	}
}
