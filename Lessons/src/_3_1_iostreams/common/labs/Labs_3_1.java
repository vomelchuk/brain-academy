package _3_1_iostreams.common.labs;

import java.io.File;
import _3_1_iostreams.common.Common_3_1;
import _3_1_iostreams.common.labs._3_1_1.FilesList;
import _3_1_iostreams.common.labs._3_1_2.Cat;
import _3_1_iostreams.common.labs._3_1_3.FileCopy;

public class Labs_3_1 {
	
	public static void demo() {
		lab_3_1_1();
//		//lab_3_1_2();
//		lab_3_1_3();
	}
	
	private static void lab_3_1_1() {
		FilesList list = new FilesList(Common_3_1.class);
		list.printFilesList();
		
		String path = System.getProperty("java.home");
		FilesList list2 = new FilesList(new File(path));
		list2.printFilesList();
	}
	
	private static void lab_3_1_2() {
		String filePath = "src/_3_1_iostreams/common/labs/_3_1_2/lab_3_1_2.txt";
		Cat reader = new Cat(filePath);
		reader.readInputFile();
	}
	
	private static void lab_3_1_3() {
		String source = "src/_3_1_iostreams/common/labs/_3_1_3/source.txt";
		String copy = "src/_3_1_iostreams/common/labs/_3_1_3/copy.txt";
		FileCopy copyWriter = new FileCopy(source, copy);
		copyWriter.copyFile();
		copyWriter.readCopy();
	}
}
