package _3_2_serialization.test.listings.transient_and_static;

import java.io.*;

public class TransientAndStatic {
	
	static class A implements Serializable { 
		transient int a = 1; 
		static int b = 2; 
	}
	
	public static void demo() {
		
		A writeA = new A();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
   "src/_3_2_serialization/test/listings/transient_and_static/serTransAndStat.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(writeA);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		A.b = 10; /* changes value of static member of class A for all its 
		             instances */
		A readA;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
   "src/_3_2_serialization/test/listings/transient_and_static/serTransAndStat.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			readA = (A) oin.readObject();
			System.out.println("Transient field \'a\': " + readA.a);
			System.out.println("Static field \'b\': " + readA.b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				oin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
