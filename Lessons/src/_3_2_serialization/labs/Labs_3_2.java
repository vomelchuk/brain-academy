package _3_2_serialization.labs;

import java.io.*;

public class Labs_3_2 {
	
	public static void demo() {
		lab_3_2_1_and_2();
		//lab_3_2_3();
	}
	
	/*
	 * Lab Work 3-2-1
	 * 
	 * Objectives: 
	 * 
	 *             - Create class Employee with text private fields : 
	 *               String name, String address, int SSN, int number. 
	 *               
	 *             - Add getters and setters to Employee class.  
	 *             
	 *             - Override the toString() method.
	 *             
	 *             - Create SerializeDemo program which instantiates an Employee
	 *               object and serializes it to a file. 
	 */
	private static void lab_3_2_1_and_2() {
		_3_2_serialization.labs._3_2_1_and_2.Employee employeeWrite = 
			                            new _3_2_serialization.labs._3_2_1_and_2
			                              .Employee("Mykola", "Lviv", 1, 12345);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
	   "src/_3_2_serialization/labs/_3_2_1_and_2/employee1_2.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employeeWrite);
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

		_3_2_serialization.labs._3_2_1_and_2.Employee employeeRead;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
	   "src/_3_2_serialization/labs/_3_2_1_and_2/employee1_2.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			employeeRead = (_3_2_serialization.labs._3_2_1_and_2.Employee) 
					                                           oin.readObject();
			System.out.println("Name: " + employeeRead.getName());
			System.out.println("Adress: " + employeeRead.getAddress());
			System.out.println("SSN: " + employeeRead.getSSN());
			System.out.println("Number: " + employeeRead.getNumber());
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
	
	/*
	 * Lab Work 3-2-3
	 * 
	 * Objectives: Modify class Employee(add transient keyword to SSN field). 
	 */
	private static void lab_3_2_3() {
		_3_2_serialization.labs._3_2_3.Employee employeeWrite = 
				                              new _3_2_serialization.labs._3_2_3
				                          .Employee("Mykola", "Lviv", 1, 12345);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		"src/_3_2_serialization/labs/_3_2_3/employee_3.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employeeWrite);
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

		_3_2_serialization.labs._3_2_3.Employee employeeRead;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
	    "src/_3_2_serialization/labs/_3_2_3/employee_3.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			employeeRead = (_3_2_serialization.labs._3_2_3.Employee) 
					                                           oin.readObject();
			System.out.println("Name: " + employeeRead.getName());
			System.out.println("Adress: " + employeeRead.getAddress());
			System.out.println("SSN: " + employeeRead.getSSN());
			System.out.println("Number: " + employeeRead.getNumber());
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
