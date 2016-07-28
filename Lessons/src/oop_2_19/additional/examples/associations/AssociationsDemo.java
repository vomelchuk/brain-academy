package oop_2_19.additional.examples.associations;

import oop_2_19.additional.examples.associations.strong.aggregation.Ship;
import oop_2_19.additional.examples.associations.strong.aggregation.ShipAnchor;
import oop_2_19.additional.examples.associations.strong.aggregation.ShipEngine;
import oop_2_19.additional.examples.associations.strong.composition.Animal;
import oop_2_19.additional.examples.associations.strong.multiplicity.AirPortRace;
import oop_2_19.additional.examples.associations.strong.multiplicity.Passenger;
import oop_2_19.additional.examples.associations.weak.Server;
import oop_2_19.additional.examples.associations.weak.User;

public class AssociationsDemo {
	
	public static void demo() {
		//weakDemo();
		strongDemo();
	}
	
	/*
	 * Weak: class methods takes arguments or
	 *       or returns instance of other class
	 */
	private static void weakDemo() {
		User admin = User.UserConfigurator.getUser("God", "admin", "admin");
		User loser = User.UserConfigurator.getUser("Loser", "loser", "loser");
		
		Server gitHub = new Server();
		
		gitHub.signIn(admin);
		gitHub.signIn(loser);
	}
	
	private static void strongDemo() {
//		aggregationDemo();
//		compositionDemo();
		multiplicityDemo();
	}
	
	/* ----- SERVICE METHODS ----- */
	
	/*
	 * Aggregation: is a kind of strong association, which
	 *              represents whole objects and parts.
	 *              Parts of aggregated object are independence
	 *              to life whole object and they're also opened
	 *              (has non-private access modifier)
	 */
	private static void aggregationDemo() {
		ShipEngine weakEngine = new ShipEngine(55651111L, 3500.5f);
		ShipAnchor oldAnchor = new ShipAnchor(52.4f);
		
		Ship victory = new Ship(weakEngine, oldAnchor);
		System.out.println(victory);
		
		ShipEngine awesomeEngine = new ShipEngine(54755651111L, 33500.5f);
		ShipAnchor topModernAnchor = new ShipAnchor(5000.5f);
		
		victory.newConfiguration(awesomeEngine, topModernAnchor);
		System.out.println(victory);
	}
	
	private static void compositionDemo() {
		Animal victim = new Animal(80, 1.5f);
		System.out.println(victim);
	}
	
	private static void multiplicityDemo() {
		AirPortRace raceMoskow = new AirPortRace("Lviv-Moskow");
		AirPortRace raceTokyo = new AirPortRace("Lviv-Tokyo", new Passenger());
		AirPortRace raceHawai = new AirPortRace("Lviv-Hawai", 
				                                 new Passenger[] {
				                                		 new Passenger(),
				                                		 new Passenger(),
				                                		 new Passenger()
				                                 });
		System.out.println(raceMoskow);
		System.out.println(raceTokyo);
		System.out.println(raceHawai);
	}
}
