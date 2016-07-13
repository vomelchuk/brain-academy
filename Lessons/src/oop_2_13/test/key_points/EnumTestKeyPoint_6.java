package oop_2_13.test.key_points;

/*
 * 6. Enumeration like a static nested class
 */
public interface EnumTestKeyPoint_6 {
	
	/* Getting access to enumeration members like to members of 
	 * static nested class */
	static void demo() {
		SayGreeting hello = new SayGreeting(EnumTestKeyPoint_6 /* instance    */
				                            .SayGreeting       /* initializing*/
				                            .Greeting.HELLO);
		System.out.println(hello.greeting); 
		
		System.out.println(EnumTestKeyPoint_6 /* direct static */
                           .SayGreeting       /* member (constant) accessing */
                           .Greeting.HOLA);
	}
	
	static class SayGreeting {
		
		Greeting greeting;
		
		public SayGreeting(Greeting greeting) {
			this.greeting = greeting;
		}
		
		enum Greeting {
			HELLO, HOLA, HI
		}
	}
}
