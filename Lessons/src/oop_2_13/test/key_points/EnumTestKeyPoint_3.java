package oop_2_13.test.key_points;

/*
 * 3. Static member behavior: instances and direct constants (accessed for 
 *    both - instance and static)
 */
public interface EnumTestKeyPoint_3 {
	
	static void demo() {
		Answer answer = Answer.YES;
		System.out.println(answer.NO); //via instance access
		System.out.println(answer); /* instance own reference not changed 
		                               because it was not assigned to another 
		                               enumeration constant value */
		System.out.println(Answer.NO); //direct access to static member
	}
	
	enum Answer { 
		YES, NO;
	}
}
