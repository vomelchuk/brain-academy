package _3_1_iostreams.additional.examples.nio;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOPath {

	public static void main(String[] args) throws URISyntaxException {

		/* Абсолютний шлях до файла */
		Path absPath = Paths.get("c:\\io\\io-sample\\texts\\file.txt");

		/* Відносний шлях до файлу - (basePath, relativePath) */
		Path relPath = Paths.get("c:\\texts", "io\\io-sample\\file.txt");
		/* Отримання відносної частини шляху */
		Path pathAbsolute = Paths.get("c:\\io\\io-sample\\texts\\file.txt");
		Path pathBase = Paths.get("c:\\io");
		Path pathRelative = pathBase.relativize(pathAbsolute);

		/* "." - шлях до поточної директорії/папки */
		Path currentDir = Paths.get(".");
		/* директорія розташування проекту */
		System.out.println(currentDir.toAbsolutePath());

		/* директорія розташування файлу битової версії класу */
		System.out.println(NIOPath.class.getResource("."));
		/* батьківська директорія попередньої директорії */
		System.out.println(NIOPath.class.getResource(".."));

		/* директорія проекту, в якому розташований файл битової версії класу */
		Path treePath = Paths.get(NIOPath.class.getResource(".").toURI());
		System.out.println(treePath.getParent());
		/* батьківська директорія попередньої директорії */
		Path treePath2 = Paths.get(NIOPath.class.getResource("..").toURI());
		System.out.println(treePath2.getParent());
	}
}
