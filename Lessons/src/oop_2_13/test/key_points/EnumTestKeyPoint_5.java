package oop_2_13.test.key_points;

/*
 * 5. Enumeration constructor access modifiers (default and private only 
 *    allowed)
 */
public interface EnumTestKeyPoint_5 {
	
	static void demo() {
		System.out.println("It is both - \"private\" and \"default\"\n"
				         + "access modifiers allowed for enumeration types\n"
				         + "constructors!"); 
	}
	
	enum Answer { 
		YES, NO;
		
		private Answer() {} //Enumeration constructor private access modifier
	}
	
	enum Voting {
		YES(150), REFRAINED(1), NO(5);
		
		private int amount;
		
		public int getAmountOfVotes() {
			return amount;
		}
		
		Voting(int amount) { //Enumeration constructor default access modifier
			this.amount = amount;
		}
	}
}
