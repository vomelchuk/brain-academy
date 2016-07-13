package oop_2_13.test.key_points;

/*
 * 9.  Enumeration toString() method overriding (it has default realization 
 *     from Enum class):
 *     
 *     From Enum class:
 *        "Returns the name of this enum constant, as contained in the
 *        declaration.  This method may be overridden, though it typically
 *        isn't necessary or desirable.  An enum type should override this
 *        method when a more "programmer-friendly" string form exists.
 *    
 *        @return the name (Enum class instance field) of this enum constant"
 *       
 *        public String toString() {
 *            return name;
 *        }
 */
public interface EnumTestKeyPoint_9 {
	
	static void demo() {
		System.out.printf("Enumeration types%n"
				         + "has default toString() method%n"
				         + "realization from Enum class:%n\t%s%n",
				         DefaultToString.CORRECT_VIEW.toString()); 
	}
	
	enum DefaultToString { CORRECT_VIEW }
}
