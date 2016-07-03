package module2.oop2_4.labs.lab2;

import module2.oop2_4.labs.lab1.MyMath;

public class Calculation {

	private int[] array;

	public Calculation(int[] array) {
		this.array = array;
	}
	
	public int[] getArray(){
		return array;
	}

	public int getMin() {
		return MyMath.findMin(array);

	}

	public int getMax() {
		return MyMath.findMax(array);
	}

}
