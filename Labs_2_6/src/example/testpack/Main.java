package example.testpack;

import com.brainacad.carpack.Car;

import example.applepack.Apple;

public class Main {

	public static void main(String[] argv) {

		Apple apple = new Apple(5);
		Car car = new Car(1250);

		System.out.println("Apple weight: " + apple.getMass());
		System.out.println("Car weight: " + car.getMass());
	}

}