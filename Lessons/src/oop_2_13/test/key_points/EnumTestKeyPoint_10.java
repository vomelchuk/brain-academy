package oop_2_13.test.key_points;

/*
 * 10. Enumeration private constructor (there is no any possibility to 
 *     instantiate enumeration type)
 */
public interface EnumTestKeyPoint_10 {
	
	static void demo() {
		/*EnumInstantiating instance = new EnumInstantiating();*/ /* -> compile
		                                                           * -> error:
		                              * -> there is no any possibility to 
                                      *    instantiate enumeration type */
		System.out.println("There is no any possibility\n"
				         + "to instantiate enumeration type\n"); 
	}
	
	enum EnumInstantiating { ALLOWED, NOT_ALLOWED }
}
