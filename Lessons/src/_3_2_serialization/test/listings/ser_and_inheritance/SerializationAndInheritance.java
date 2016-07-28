package _3_2_serialization.test.listings.ser_and_inheritance;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 *     Main rule for serialization with inheritance is if super class implements
 * Serializable interface - all its derived classes does too.
 * 
 */
public class SerializationAndInheritance {
	
	public static void demo() {
		class A implements Serializable { protected int a = 1; }
		class B extends A { protected int b = 2; }
		class C extends B { protected int c = 3; }
		
		C source = new C();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		"src/_3_2_serialization/test/listings/ser_and_inheritance/serAndIS_A.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(source);
			System.out.println("Derived class serialized successfully!");
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
	}
}
