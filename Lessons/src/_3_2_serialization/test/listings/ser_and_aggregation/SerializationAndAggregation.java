package _3_2_serialization.test.listings.ser_and_aggregation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 *     Main rule for serialization with inheritance is if super class implements
 * Serializable interface - all its derived classes does too.
 * 
 */
public class SerializationAndAggregation {
	
	public static void demo() {
		class A implements Serializable {}
		class B { protected A a = new A(); }
		
		B source = new B();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
	   "src/_3_2_serialization/test/listings/ser_and_aggregation/serAndHAS_A.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(source);
			System.out.println("Derived class serialized successfully!");
		} catch (IOException e) {
			System.out.println("Not all aggregated classes are serializable!");
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
