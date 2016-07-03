package module2.oop2_5.labs.lab1;

public class MyInitTest {

	{
		System.out.println("non-static initialization block 1");
	}
	{
		System.out.println("non-static initialization block 2");
	}
	static {
		System.out.println("static initialization block 1");
	}
	static {
		System.out.println("static initialization block 2");
	}

	public MyInitTest() {
		this(0);
		System.out.println("constructor 2");
	}

	public MyInitTest(int x) {
		System.out.println("constructor 1");
	}
}
