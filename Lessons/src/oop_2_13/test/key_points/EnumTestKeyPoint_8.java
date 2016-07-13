package oop_2_13.test.key_points;

/*
 * 8. Enumeration and inheritance (only interfaces)
 */
public interface EnumTestKeyPoint_8 {
	
	static void demo() {
		System.out.println("Enumeration types can inherit\n"
				         + "(implement) interfaces!\n"
				         + "But they cannot inherit (extends) other classes!\n"
				         + "Implicitly  each enumeration type extends Object\n"
				         + "and Enum classes\n"); 
	}
	
	enum Clone implements Cloneable { CLONE, ORIGIN } /* enumeration types can
	                                                   * inherit (implement) 
	                                                   * interfaces */
	
	/*enum SystemState extends System{ IN_PROGRESS, STOPPED } */ /* -> compile
	                                                              * -> error:
	                                 * -> enumeration types cannot 
	                                 *    inherit (extends) other classes;
	                                 *    implicitly  each enumeration type
	                                 *    extends Object and Enum classes */
}
