package oop_2_18.common.presentation.paragraphs;

import java.text.NumberFormat;
import java.util.Locale;

public class CreatingLocale {
	
	/*
	 * Paragraph: Creating a Locale. 
	 * Slides: 39-47
	 */
	public static void demo() {
//		locale44();
//		locale45();
		locale47();
	}

	/*
	 * Slide # 44: Locale and country NumberFormat
	 */
	private static void locale44() {
		long number = 25000000L;
		NumberFormat numFmt = NumberFormat.getInstance();
		System.out.println("Default:" + numFmt.format(number));
		NumberFormat numItl = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("ITALY: " + numItl.format(number));
		NumberFormat numChn = NumberFormat.getInstance(Locale.CHINA );
		System.out.println("CHINA: " + numChn.format(number));
	}
	
	/*
	 * Slide # 45: Locale and country currency (with enumeration constants)
	 */
	private static void locale45() {
		long number = 25000000L;
		NumberFormat curDef =
		NumberFormat.getCurrencyInstance();
		System.out.println("Default: " + curDef.format(number));
		NumberFormat curIt =
		NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("ITALY: " + curIt.format(number));
		NumberFormat curCh =
		NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("CHINA: " + curCh.format(number));
	}
	
	/*
	 * Slide # 47: Locale and country currency (with string literals)
	 */
	private static void locale47() {
		long number = 25000000L;
		NumberFormat curDef =
		NumberFormat.getCurrencyInstance();
		System.out.println("Default: "+curDef.format(number));
		Locale loc = new Locale("fr", "FR");
		NumberFormat curFr =
		NumberFormat.getCurrencyInstance(loc);
		System.out.println("FR: "+curFr.format(number));
	}
}
