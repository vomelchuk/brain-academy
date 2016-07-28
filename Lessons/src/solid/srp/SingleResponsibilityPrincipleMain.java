package solid.srp;

import solid.srp.single_responsibility.implementation.*;

/*
 * Single Responsibility Principle means a class should have one, and only one, 
 * reason to change
 */
public class SingleResponsibilityPrincipleMain {

	public static void main(String[] args) {
		Communicator communicator = new Communicator(new Connector());
		communicator.connect("+38 096 576 72 72");
		communicator.send("Hello, Yevgen!");
		System.out.println(communicator.recv());
		
	}

}
