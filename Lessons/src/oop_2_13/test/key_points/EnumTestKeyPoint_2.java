package oop_2_13.test.key_points;

import java.util.Arrays;

/*
 * 2.  Enumeration methods invoking (instance and static):
 * 
 *     Instance methods list:
 *                            1. name()
 *                            2. ordinal()
 *                            
 *     Static methods list:
 *                            1. values()
 *                            2. valueOf()
 */
public interface EnumTestKeyPoint_2 {
	
	static void demo() {
		Answer answer = Answer.YES;
		System.out.printf("Answer enumeration constant %s has "
				        + "its ordinal value %d%n%n", 
				          answer.name(), answer.ordinal());
		
		System.out.printf("Answer enumeration has next list of constants:"
				        + "%n%s%n", 
				          Arrays.toString(Answer.values()));
	}
	
	enum Answer { 
		YES, NO;
	}
}
