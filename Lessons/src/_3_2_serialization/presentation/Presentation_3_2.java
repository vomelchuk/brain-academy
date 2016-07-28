package _3_2_serialization.presentation;

import java.io.*;

import _3_2_serialization.presentation._40_43.User;

public class Presentation_3_2 {

	public static void demo() {
		_11_14();
		//_17();
		//_19_22();
		//_25_32();
		//_35_37();
		//_40_43();
	}

	private static void _11_14() {
		_3_2_serialization.presentation._11_14.Student s = 
				                      new _3_2_serialization.presentation._11_14
				                                .Student("Sasha", "Petrov", 22);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		   "src/_3_2_serialization/presentation/_11_14/student.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
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

		_3_2_serialization.presentation._11_14.Student s2;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
	       "src/_3_2_serialization/presentation/_11_14/student.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			s2 = (_3_2_serialization.presentation._11_14
					                                 .Student) oin.readObject();
			System.out.println("FirstName: " + s2.getFirstName());
			System.out.println("LastName: " + s2.getLastName());
			System.out.println("Age: " + s2.getAge());
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

	private static void _17() {
		_3_2_serialization.presentation._17.Student s = 
				                      new _3_2_serialization.presentation._17
				                                .Student("Sasha", "Petrov", 22);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		  "src/_3_2_serialization/presentation/_17/student2.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		_3_2_serialization.presentation._17.Student s2;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
		  "src/_3_2_serialization/presentation/_17/student2.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			s2 = 
			  (_3_2_serialization.presentation._17.Student) oin.readObject();
			System.out.println("FirstName: " + s2.getFirstName());
			System.out.println("LastName: " + s2.getLastName());
			System.out.println("Age: " + s2.getAge());
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
	
	private static void _19_22() {
		//_20(); //generates exception
		//_22();
	}
	
	private static void _20() {
		_3_2_serialization.presentation._19_22.not_serializable.Course crs = 
				     new _3_2_serialization.presentation._19_22.not_serializable
				                                        .Course(11,"Java Base");
		_3_2_serialization.presentation._19_22.not_serializable.Student s = 
				     new _3_2_serialization.presentation._19_22.not_serializable
				                                  .Student("Sasha","Petrov",22);
		s.setCourse(crs);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		  "src/_3_2_serialization/presentation/_19_22/not_serializable/student3.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		}catch(IOException e){
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
	
	private static void _22() {
		_3_2_serialization.presentation._19_22.serializable.Course crs = 
			         new _3_2_serialization.presentation._19_22.serializable
			                                            .Course(11,"Java Base");
	    _3_2_serialization.presentation._19_22.serializable.Student s = 
	                     new _3_2_serialization.presentation._19_22.serializable
	                                              .Student("Sasha","Petrov",22);
	    s.setCourse(crs);
	    FileOutputStream fos = null;
	    ObjectOutputStream oos = null;
	    try {
	    	String outputPath = 
	    "src/_3_2_serialization/presentation/_19_22/serializable/student_4.ser";
	    	fos = new FileOutputStream(outputPath);
	    	oos = new ObjectOutputStream(fos);
	    	oos.writeObject(s);
	    	} catch(IOException e) {
	    		e.printStackTrace();
	    	} finally {
	    		try {
	    			fos.close();
	    			oos.close();
	    		    } catch (IOException e) {
	    		    	e.printStackTrace();
	    		    }
	    	}
	    
	    _3_2_serialization.presentation._19_22.serializable.Student s2;
	    FileInputStream fis = null;
	    ObjectInputStream oin = null;
	    try {
	    	String inputPath = 
	    "src/_3_2_serialization/presentation/_19_22/serializable/student_4.ser";
	    	fis = new FileInputStream(inputPath);
	    	oin = new ObjectInputStream(fis);
	    	s2 = (_3_2_serialization.presentation._19_22.serializable.Student) 
				                                               oin.readObject();
	    	System.out.println("FirstName: " + s2.getFirstName());
	    	System.out.println("LastName: " + s2.getLastName());
	    	System.out.println("Age: " + s2.getAge());
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
	
	private static void _25_32() {
		_27();
		//_31();
	}
	
	private static void _27() {
		_3_2_serialization.presentation._25_32.not_inherited.Student s = 
				                      new _3_2_serialization.presentation._25_32.not_inherited.Student("Sasha","Petrov",22);
		System.out.println();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		  "src/_3_2_serialization/presentation/_25_32/not_inherited/student4.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
					oos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		_3_2_serialization.presentation._25_32.not_inherited.Student s2;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
		  "src/_3_2_serialization/presentation/_25_32/not_inherited/student4.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			s2 = (_3_2_serialization.presentation._25_32.not_inherited.Student) 
			                                                   oin.readObject();
			System.out.println("FirstName: " + s2.getFirstName());
			System.out.println("LastName: " + s2.getLastName());
			System.out.println("Age: " + s2.getAge());
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
	
	private static void _31() {
		_3_2_serialization.presentation._25_32.inherited.Student s = 
                            new _3_2_serialization.presentation._25_32.inherited
                                                 .Student("Sasha","Petrov", 22);
		System.out.println();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		  "src/_3_2_serialization/presentation/_25_32/inherited/student5.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		_3_2_serialization.presentation._25_32.inherited.Student s2;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
		  "src/_3_2_serialization/presentation/_25_32/inherited/student5.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			s2 = (_3_2_serialization.presentation._25_32.inherited.Student) 
                                                               oin.readObject();
			System.out.println("FirstName: " + s2.getFirstName());
			System.out.println("LastName: " + s2.getLastName());
			System.out.println("Age: " + s2.getAge());
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
	
	private static void _35_37() {
		_3_2_serialization.presentation._35_37.Student s = 
                new _3_2_serialization.presentation._35_37
                                     .Student("Sasha","Petrov", 22);
		System.out.println();
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		  "src/_3_2_serialization/presentation/_35_37/student6.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		_3_2_serialization.presentation._35_37.Student s2;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
		  "src/_3_2_serialization/presentation/_35_37/student6.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			s2 = (_3_2_serialization.presentation._35_37.Student) 
                                                               oin.readObject();
			System.out.println("FirstName: " + s2.getFirstName());
			System.out.println("LastName: " + s2.getLastName());
			System.out.println("Age: " + s2.getAge());
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
	
	private static void _40_43() {
		User userWrite = new User(1, "AlexUser", "name@mail.com");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			String outputPath = 
		  "src/_3_2_serialization/presentation/_40_43/userfile.ser";
			fos = new FileOutputStream(outputPath);
			oos = new ObjectOutputStream(fos);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			oos.writeObject(userWrite);
			oos.flush();
			oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		User userRead;
		FileInputStream fis = null;
		ObjectInputStream oin = null;
		try {
			String inputPath = 
		  "src/_3_2_serialization/presentation/_40_43/userfile.ser";
			fis = new FileInputStream(inputPath);
			oin = new ObjectInputStream(fis);
			userRead = (User) oin.readObject();
			System.out.println("Id: " + userRead.getId());
			System.out.println("Name: " + userRead.getUsername());
			System.out.println("E-mail: " + userRead.getEmail());
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
