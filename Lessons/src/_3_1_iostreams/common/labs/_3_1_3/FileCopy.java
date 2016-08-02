package _3_1_iostreams.common.labs._3_1_3;

import java.io.*;

public class FileCopy {
	
	private String sourceFilePath;
	private String copyFilePath;
	
	public FileCopy(String inputFilePath, String copyFilePath) {
		this.sourceFilePath = inputFilePath;
		this.copyFilePath = copyFilePath;
	}
	
	public void copyFile() {
		FileInputStream sourceReader = null;
		FileOutputStream copyWriter = null;
		try {
			sourceReader = new FileInputStream(sourceFilePath);
			copyWriter = new FileOutputStream(copyFilePath);
			int character;
			while((character = sourceReader.read()) != -1)
				copyWriter.write(character);
			System.out.println("File successfully copied!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sourceReader != null) {
				try {
					sourceReader.close();
					copyWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void readCopy() {
		FileInputStream sourceReader = null;
		OutputStream copyPrinter = null;
		try {
			sourceReader = new FileInputStream(sourceFilePath);
			copyPrinter = System.out;
			System.out.println("\n\tCopy file content:\n");
			int character;
			while((character = sourceReader.read()) != -1)
				copyPrinter.write(character);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sourceReader != null) {
				try {
					sourceReader.close();
					copyPrinter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		FileCopy copyWriter = new FileCopy(args[0], args[1]);
		copyWriter.copyFile();
		copyWriter.readCopy();
	}
}
