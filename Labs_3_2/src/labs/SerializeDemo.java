package labs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Vitaliy", "Zerova 11a", 798, 21);
		System.out.println("Object before serialization:\n" + employee1);

		Employee employee2;
		String fileName = "/home/vitaliy/lab1.ser";
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
