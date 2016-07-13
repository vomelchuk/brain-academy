package oop_2_13.test;

import oop_2_13.test.key_points.*;

/*
 * Test 2.13. Key points:
 * 
 *      1.  Enumeration constants list declaration priority (must be declared 
 *          first in enumeration body)
 *      2.  Enumeration methods invoking (instance and static)
 *      3.  Static member behavior: instances and direct constants (accessed for 
 *          both - instance and static)
 *      4.  Argument types in enumeration class methods (correct signature)
 *      5.  Enumeration constructor access modifiers (default and private only 
 *          allowed)
 *      6.  Enumeration like a static nested class
 *      7.  Enumeration and local declaration (not allowed)
 *      8.  Enumeration and inheritance (only interfaces)
 *      9.  Enumeration toString() method overriding (it has default realization 
 *          from Enum class)
 *      10. Enumeration private constructor (there is no any possibility to 
 *          instantiate enumeration type)
 */
public interface Test_2_13 {
	
	static void demo() {
		//EnumTestKeyPoint_1.demo();
		//EnumTestKeyPoint_2.demo();
		//EnumTestKeyPoint_3.demo();
		//EnumTestKeyPoint_4.demo();
		//EnumTestKeyPoint_5.demo();
		//EnumTestKeyPoint_6.demo();
		//EnumTestKeyPoint_7.demo();
		//EnumTestKeyPoint_8.demo();
		//EnumTestKeyPoint_9.demo();
		EnumTestKeyPoint_10.demo();
	}
}
