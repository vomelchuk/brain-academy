package _3_1_iostreams.additional.examples.nio;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.*;

public class NIOFile {

	public static void main(String[] args) throws Exception {
		// nioFilesExist();
		// nioCreateDirectoryAndFile();
		// nioCopy();
		// nioCopyOverwritingExistingFiles();
		// nioFileMove();
		// nioDirectoryAndFileDelete();
		// nioWalkFileTree();
		// nioSearchingFiles();
		// nioFileRead();
		// nioFileWrite();
		// nioFileWrite2();
	}

	private static void nioFilesExist() throws URISyntaxException {

		Path path = Paths.get(NIOPath.class.getResource(".").toURI());
		Path path2 = Paths.get(path.toAbsolutePath() + "\\dirExist");

		boolean pathExists = Files.exists(path, new LinkOption[] { LinkOption.NOFOLLOW_LINKS });

		System.out.println(pathExists);
	}

	private static void nioCreateDirectoryAndFile() {
		String packagePath = "\\src\\nio\\";
		String newDirName = "newDir";
		String newFileName = "newFile.txt";
		Path dirPath = Paths.get("." + packagePath + newDirName);
		Path filePath = Paths.get("." + packagePath + newFileName);
		try {
			Path newDir = Files.createDirectory(dirPath);
			Path newFile = Files.createFile(filePath);
		} catch (FileAlreadyExistsException e) {
			// спрацює, якщо директорія вже існує
		} catch (IOException e) {
			// перехопить інші виключення вводу/виводу
			e.printStackTrace();
		}
	}

	private static void nioCopy() {
		String dirSeparator = "\\";
		String packagePath = dirSeparator + "src" + dirSeparator + "nio" + dirSeparator;
		String destDirName = dirSeparator + "newDir" + dirSeparator;
		String targetFileName = "newFile.txt";

		Path sourcePath = Paths.get("." + packagePath + targetFileName);
		Path destinationPath = Paths.get("." + packagePath + destDirName + targetFileName);

		try {
			Files.copy(sourcePath, destinationPath);
		} catch (FileAlreadyExistsException e) {
			// спрацює, якщо цільовий файл вже існує
			e.printStackTrace();
		} catch (IOException e) {
			// перехопить інші виключення вводу/виводу
			e.printStackTrace();
		}
	}

	private static void nioCopyOverwritingExistingFiles() {
		String dirSeparator = "\\";
		String packagePath = dirSeparator + "src" + dirSeparator + "nio" + dirSeparator;
		String destDirName = dirSeparator + "newDir" + dirSeparator;
		String targetFileName = "newFile.txt";

		Path sourcePath = Paths.get("." + packagePath + targetFileName);
		Path destinationPath = Paths.get("." + packagePath + destDirName + targetFileName);

		try {
			Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (FileAlreadyExistsException e) {
			// спрацює, якщо цільовий файл вже існує
			e.printStackTrace();
		} catch (IOException e) {
			// перехопить інші виключення вводу/виводу
			e.printStackTrace();
		}
	}

	private static void nioFileMove() {
		String dirSeparator = "\\";
		String packagePath = dirSeparator + "src" + dirSeparator + "nio" + dirSeparator;
		String destDirName = dirSeparator + "newDir" + dirSeparator;
		String targetFileName = "newFile.txt";

		Path sourcePath = Paths.get("." + packagePath + targetFileName);
		Path destinationPath = Paths.get("." + packagePath + destDirName + targetFileName);

		try {
			Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// спрацює у разі невдалого переміщення файлу
			e.printStackTrace();
		}
	}

	private static void nioDirectoryAndFileDelete() {
		String dirSeparator = "\\";
		String packagePath = dirSeparator + "src" + dirSeparator + "nio" + dirSeparator;
		String targetDirName = dirSeparator + "newDir";
		String targetFileName = "newFile.txt";

		Path dir = Paths.get("." + packagePath + targetDirName);
		Path file = Paths.get("." + packagePath + targetFileName);
		try {
			Files.delete(dir);
			Files.delete(file);
		} catch (IOException e) {
			// спрацює у разі невдалого видалення файлу
			e.printStackTrace();
		}
	}

	private static void nioWalkFileTree() throws IOException {
		final Path sourceDir = Paths.get("." + "\\src\\nio\\");
		Files.walkFileTree(sourceDir, new FileVisitor<Path>() {
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
				// виводимо назву цільової директорії перед початком її обходу
				System.out.format("Directory: %s%n", dir);
				return CONTINUE;
			}

			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attr) {
				// виводимо інформацію про кожен тип файлу
				if (attr.isSymbolicLink()) {
					System.out.format("Symbolic link: %s ", file);
				} else if (attr.isRegularFile()) {
					System.out.format("Regular file: %s ", file);
				} else {
					System.out.format("Other: %s ", file);
				}
				System.out.println("(" + attr.size() + "bytes)");
				return CONTINUE;
			}

			@Override
			public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
				// виводимо назву цільової директорії після її обходу
				System.out.format("Directory: %s%n", dir);
				return CONTINUE;
			}

			@Override
			public FileVisitResult visitFileFailed(Path file, IOException exc) {
				// викидуємо викючення у випадку помилки доступу до файлу
				System.err.println(exc);
				return CONTINUE;
			}
		});
	}

	private static void nioSearchingFiles() {
		Path rootPath = Paths.get("." + "\\src\\nio\\readme.txt");
		String fileToFind = File.separator + "readme.txt";

		try {
			Files.walkFileTree(rootPath.normalize(), new SimpleFileVisitor<Path>() {

				@Override
				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
					String fileString = file.toAbsolutePath().toString();
					// System.out.println("pathString = " + fileString);

					if (fileString.endsWith(fileToFind)) {
						System.out.println("Файл знайдено за шляхом: " + file.toAbsolutePath());
						return FileVisitResult.TERMINATE;
					}
					return FileVisitResult.CONTINUE;
				}
			});
		} catch (IOException e) {
			System.out.println("Файл не знайдено!");
		}
	}

	private static void nioFileRead() {
		FileInputStream fIn = null;
		FileChannel fChan = null;
		long fSize;
		MappedByteBuffer mBuf;
		try {
			fIn = new FileInputStream("." + "\\src\\nio\\readme.txt");
			fChan = fIn.getChannel();
			fSize = fChan.size();
			mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
			for (int i = 0; i < fSize; i++)
				System.out.print((char) mBuf.get());
		} catch (IOException e) {
			System.out.println("I/O Error " + e);
		} finally {
			try {
				if (fChan != null)
					fChan.close();
			} catch (IOException e) {
				System.out.println("Error Closing Channel.");
			}
			try {
				if (fIn != null)
					fIn.close();
			} catch (IOException e) {
				System.out.println("Error Closing File.");
			}
		}
	}

	private static void nioFileWrite() {
		FileOutputStream fOut = null;
		FileChannel fChan = null;
		ByteBuffer mBuf;
		try {
			fOut = new FileOutputStream("." + "\\src\\nio\\readme.txt");
			fChan = fOut.getChannel();
			mBuf = ByteBuffer.allocate(26);
			for (int i = 0; i < 26; i++)
				mBuf.put((byte) ('A' + i));
			mBuf.rewind();
			fChan.write(mBuf);
		} catch (IOException e) {
			System.out.println("I/O Error " + e);
		} finally {
			try {
				if (fChan != null)
					fChan.close();
			} catch (IOException e) {
				System.out.println("Error Closing Channel.");
			}
			try {
				if (fOut != null)
					fOut.close();
			} catch (IOException e) {
				System.out.println("Error Closing File.");
			}
		}
	}

	private static void nioFileWrite2() {
		Charset charset = Charset.forName("US-ASCII");
		String s = "Write to file...";
		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("." + "\\src\\nio\\readme.txt"), charset)) {
			writer.write(s, 0, s.length());
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
}