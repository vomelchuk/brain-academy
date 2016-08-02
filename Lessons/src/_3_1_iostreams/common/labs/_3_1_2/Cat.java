package _3_1_iostreams.common.labs._3_1_2;

import java.io.*;

public class Cat {
	
	private String inputFilePath;
	
	public Cat(String inputFilePath) {
		this.inputFilePath = inputFilePath;
	}
	
	public void readInputFile() {
		BufferedReader inputFile = null;
		try {
			inputFile = new BufferedReader(new FileReader(inputFilePath));
			int character;
			while ((character = inputFile.read()) != -1)
				System.out.print((char) character);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (inputFile != null) {
				try {
					inputFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Cat reader = new Cat(args[0]);
		reader.readInputFile();
	}
}
