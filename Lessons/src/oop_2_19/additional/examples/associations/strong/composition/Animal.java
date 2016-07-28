package oop_2_19.additional.examples.associations.strong.composition;

public class Animal {

	private Heart heart;
	
	public Animal(float puls, float capacity) {
		heart = new Heart(puls, capacity);
	}
	
	private static class Heart {
		
		private float puls;
		private float capacity;
		
		public Heart(float puls, float capacity) {
			this.puls = puls;
			this.capacity = capacity;
		}

		@Override
		public String toString() {
			return "heart puls: " + puls 
				+ "\nheart capacity: " + capacity + "\n";
		}
		
		
	}

	@Override
	public String toString() {
		return "\t\tAnimal has heart:\n" + heart;
	}
}
