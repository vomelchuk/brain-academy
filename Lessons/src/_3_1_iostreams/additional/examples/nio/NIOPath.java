package _3_1_iostreams.additional.examples.nio;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOPath {

	public static void main(String[] args) throws URISyntaxException {

		/* ���������� ���� �� ����� */
		Path absPath = Paths.get("c:\\io\\io-sample\\texts\\file.txt");

		/* ³������� ���� �� ����� - (basePath, relativePath) */
		Path relPath = Paths.get("c:\\texts", "io\\io-sample\\file.txt");
		/* ��������� ������� ������� ����� */
		Path pathAbsolute = Paths.get("c:\\io\\io-sample\\texts\\file.txt");
		Path pathBase = Paths.get("c:\\io");
		Path pathRelative = pathBase.relativize(pathAbsolute);

		/* "." - ���� �� ������� ��������/����� */
		Path currentDir = Paths.get(".");
		/* ��������� ������������ ������� */
		System.out.println(currentDir.toAbsolutePath());

		/* ��������� ������������ ����� ������ ���� ����� */
		System.out.println(NIOPath.class.getResource("."));
		/* ���������� ��������� ���������� �������� */
		System.out.println(NIOPath.class.getResource(".."));

		/* ��������� �������, � ����� ������������ ���� ������ ���� ����� */
		Path treePath = Paths.get(NIOPath.class.getResource(".").toURI());
		System.out.println(treePath.getParent());
		/* ���������� ��������� ���������� �������� */
		Path treePath2 = Paths.get(NIOPath.class.getResource("..").toURI());
		System.out.println(treePath2.getParent());
	}
}
