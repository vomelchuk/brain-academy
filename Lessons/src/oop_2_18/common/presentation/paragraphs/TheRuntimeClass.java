package oop_2_18.common.presentation.paragraphs;

public class TheRuntimeClass {
	
	/*
	 * Paragraph: The Runtime class. 
	 * Slides: 55-58
	 */
	public static void demo() {
		theRuntimeClass55();
//		theRuntimeClass56();
	}

	/*
	 * Slide # 55: freeMemory() of JVM
	 */
	private static void theRuntimeClass55() {
		Runtime run = Runtime.getRuntime();
		int memoryBefour = (int) run.freeMemory();
		System.out.println("freeMemory:" + memoryBefour);
		int[] x = new int[20000000];
		int memoryAfter = (int) run.freeMemory();
		System.out.println("freeMemory:" + memoryAfter);
		System.out.println("Memory used for int array in bytes: " + 
		                   (memoryAfter - memoryBefour));
	}
	
	/*
	 * Slide # 56: Executing programs
	 */
	private static void theRuntimeClass56() {
		try {
			System.out.println("Executing notepad.exe");
			Process process = Runtime.getRuntime().exec("subl");
			System.out.println("Notepad should now open.");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
}
