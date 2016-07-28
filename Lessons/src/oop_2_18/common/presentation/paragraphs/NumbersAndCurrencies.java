package oop_2_18.common.presentation.paragraphs;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class NumbersAndCurrencies {
	
	/*
	 * Paragraph: Numbers and currencies. 
	 * Slides: 52-54
	 */
	public static void demo() {
		numbersAndCurrencies54();
	}

	/*
	 * Slide # 54: Currency Class instance
	 */
	private static void numbersAndCurrencies54() {
		BigDecimal currencyAmount = new BigDecimal("10.55");
		Currency cur = Currency.getInstance(Locale.US);
		NumberFormat curFmt = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(cur.getDisplayName() + ": " +
		                   curFmt.format(currencyAmount));
	}
}
