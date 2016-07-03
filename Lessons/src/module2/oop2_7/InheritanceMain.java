package module2.oop2_7;

import module2.oop2_6.labs.Lab_2_6;

import lessons.module_2.oop2_6.geometry.*;
import module2.oop2_7.inheritance.move.Eater;
import module2.oop2_7.inheritance.workers.Developer;
import module2.oop2_7.inheritance.workers.QA;

public class InheritanceMain {

	public static void main(String... arg) {
		workersDemo();
	}

	private static void workersDemo() {
		Developer petro = new Developer("Petro", 1001, "web");
		Developer orest = new Developer("Orest", 1002, "embedded");
		QA olga = new QA("Olga", 1005, "manual");

//		System.out.println(petro);
//		System.out.println(olga);
//		
//		System.out.println();
//		System.out.println(petro.equals(orest));
		
		Eater[] eaters = {petro, orest, olga};
		
		for(Eater eater: eaters){
			eater.eat();
		}
		
		
		
	}
}
