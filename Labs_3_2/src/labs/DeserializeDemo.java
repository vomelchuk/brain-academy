package labs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		Employee employee;

		ObjectInputStream ois = null;
		String fileName = "/home/vitaliy/lab1.ser";
		try (FileInputStream fis = new FileInputStream(fileName)) {
			ois = new ObjectInputStream(fis);
			employee = (Employee) ois.readObject();
			System.out.println("Object after serialization:\n" + employee);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
