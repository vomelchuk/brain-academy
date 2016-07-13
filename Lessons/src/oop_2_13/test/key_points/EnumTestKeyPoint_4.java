package oop_2_13.test.key_points;

/*
 * 4. Argument types in enumeration class methods (correct signature)
 */
public interface EnumTestKeyPoint_4 {
	
	static void demo() {
		/* System.out.println(Answer.valueOf(0)); */ /* compile error:
		                                              * valueOf() enumeration
		                                              * static method allows to 
		                                              * pass only String value
		                                              * or <Enum type>.class and
		                                              * String argument */
		Answer answer = Answer.YES;
		System.out.printf("String is correct agrument of valueOf() method:"
				        + " %s%n", 
				          Answer.valueOf("YES")); //correct arguments passed
		System.out.printf("Enumeration \"%s\" has constant \'YES\': %s%n"
				        + "Enumeration \"%s\" has constant \'YES\': %s%n",
				          Answer.class.getSimpleName(),
				          Answer.valueOf(Answer.class, "YES"),
				          Voting.class.getSimpleName(),
				          Voting.valueOf(Voting.class, "YES")); /* correct 
		                                                           arguments 
		                                                           passed */
	}
	
	enum Answer { 
		YES, NO;
	}
	
	enum Voting {
		YES, REFRAINED, NO
	}
}
