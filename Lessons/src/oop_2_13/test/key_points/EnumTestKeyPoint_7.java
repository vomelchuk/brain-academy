package oop_2_13.test.key_points;

/*
 * 7.  Enumeration and local declaration (not allowed) 
 */
public interface EnumTestKeyPoint_7 {
	
	static void demo() {
		/* enum Local { ALLOWED, NOT_ALLOWED } */ /* compile error: 
		                                           * local enumeration types
		                                           * declaration is 
		                                           * not allowed */
		System.out.println("Local enumeration types declaration\n"
				         + "is not allowed!"); 
	}
}
