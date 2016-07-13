package oop_2_13.test.key_points;

/*
 * 1.  Enumeration constants list declaration priority (must be declared 
 *     first in enumeration body)
 */
public interface EnumTestKeyPoint_1 {

	static void demo() {
		System.out.println("Enumeration constants\n"
				         + "list must be declared first\n"
				         + "in enumeration body\n"); 
	}
	
	enum Answer { 
		/*private int numer;*/ /* compile error: enumeration constants list must 
		                          be declared first in enumeration body */
		YES, NO;
	}
}
