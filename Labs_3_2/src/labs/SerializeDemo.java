package labs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {

		Employee employee = new Employee("Vitaliy", "Zerova 11a", 798, 21);
		System.out.println("Object before serialization:\n" + employee);

		String fileName = "/home/vitaliy/lab1.ser";
		try (FileOutputStream fos = new FileOutputStream(fileName)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
