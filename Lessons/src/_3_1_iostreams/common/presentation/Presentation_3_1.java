package _3_1_iostreams.common.presentation;

import java.io.*;
import java.util.Arrays;

public class Presentation_3_1 {
	
	public static void demo() {
		// streamClasses_10();
		// streamClasses_11();
		// streamClasses_12();
		// streamClasses_15();
		// streamClasses_17();
		//streamClasses_18_19();
		streamClasses_30();
	}

	/* ----- Slide 10 ----- */
	private static void streamClasses_10() {
		InputStream stdin = System.in;
		try {
			int val = System.in.read();
			System.out.println(val);
		} catch (IOException e) {
		}
	}

	private static void streamClasses_11() {
		OutputStream stdout = System.out;
		try {
			stdout.write(new byte[] { 97, 98, 99 });
		} catch (IOException e) {
		}
	}

	private static void streamClasses_12() {
		FileInputStream in = null;
		FileOutputStream out = null;

		String inPath = "src/common/presentation/resources/input12.txt";
		String outPath = "src/common/presentation/resources/output12.txt";
		try {
			in = new FileInputStream(inPath);
			out = new FileOutputStream(outPath);

			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char) c);
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void streamClasses_15() {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		String inPath = "src/common/presentation/resources/input15.txt";
		String outPath = "src/common/presentation/resources/output15.txt";
		try {
			inputStream = new FileReader(inPath);
			outputStream = new FileWriter(outPath);

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void streamClasses_17() {
		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		try {
			String inPath = "src/common/presentation/resources/input17.txt";
			String outPath = "src/common/presentation/resources/output17.txt";
			in = new BufferedInputStream(new FileInputStream(inPath));
			out = new BufferedOutputStream(new FileOutputStream(outPath));

			int byteRead;
			while ((byteRead = in.read()) != -1) {
				out.write(byteRead);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void streamClasses_18_19() {
		try {
			String outPath = "src/common/presentation/resources/dataout18.dat";
			DataOutputStream out = new DataOutputStream(
					   new BufferedOutputStream(new FileOutputStream(outPath)));
			out.writeShort(1200);
			out.writeInt(50000);
			out.writeLong(12345678L);
			out.writeDouble(55.66);
			out.writeBoolean(true);
			out.writeUTF("Hello!!!");
			out.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			String outPath = "src/common/presentation/resources/dataout18.dat";
			DataInputStream in = new DataInputStream(
					     new BufferedInputStream(new FileInputStream(outPath)));
			System.out.println("short: " + in.readShort());
			System.out.println("int: " + in.readInt());
			System.out.println("long: " + in.readLong());
			System.out.println("double: " + in.readDouble());
			System.out.println("boolean: " + in.readBoolean());
			System.out.println("String UTF: " + in.readUTF());
			System.out.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void streamClasses_30() {
		RandomAccessFile raf = null;
		try {
			String outPath = "src/common/presentation/resources/ra_test_23.txt";
			raf = new RandomAccessFile(outPath, "rw");
			raf.write(new byte[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
			raf.seek(5);
			raf.write(new byte[] {66, 77, 99});
			raf.seek(0);
			byte[] buf = new byte[10];
			int n = raf.read(buf, 0, 10);
			System.out.println(Arrays.toString(buf));
			raf.close();
		} catch (IOException e) {
		}
	}
}
